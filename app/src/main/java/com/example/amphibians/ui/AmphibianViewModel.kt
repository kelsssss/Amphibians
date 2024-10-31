package com.example.amphibians.ui


import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.amphibians.network.AmphibiansRepository
import com.example.amphibians.ui.model.Amphibian
import kotlinx.coroutines.launch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import coil3.network.HttpException
import com.example.amphibians.AmphibiansApplication
import okio.IOException


sealed interface AmphibianUiState{
    data class Success(val amphibians : List<Amphibian>) : AmphibianUiState
    object Loading : AmphibianUiState
    object Error : AmphibianUiState

}

class AmphibianViewModel(
    private val amphibiansRepository: AmphibiansRepository
) : ViewModel() {

    var amphibiansUiState : AmphibianUiState by mutableStateOf(AmphibianUiState.Loading)
        private set

    init{
        getAmphibiansData()
    }


    fun getAmphibiansData(){
        viewModelScope.launch{
            amphibiansUiState = try {
                AmphibianUiState.Success(amphibiansRepository.getData())
            } catch (e: IOException) {
                AmphibianUiState.Error
            } catch (e: HttpException){
                AmphibianUiState.Error
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as AmphibiansApplication)
                val amphibiansRepository = application.container.amphibiansRepository
                AmphibianViewModel(amphibiansRepository = amphibiansRepository)
            }
        }
    }

}


