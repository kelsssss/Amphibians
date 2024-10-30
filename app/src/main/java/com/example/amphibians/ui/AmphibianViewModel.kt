package com.example.amphibians.ui


import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.amphibians.network.Repository
import com.example.amphibians.ui.model.Amphibian
import com.example.amphibians.ui.screens.AmphibiansApp
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import kotlinx.coroutines.processNextEventInCurrentThread
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import coil3.network.HttpException
import okio.IOException


sealed interface AmphibianUiState{
    data class Success(val amphibians : List<Amphibian>) : AmphibianUiState
    object Loading : AmphibianUiState
    object Error : AmphibianUiState

}

class AmphibianViewModel() : ViewModel() {



    private val repository = Repository

    var amphibiansUiState : AmphibianUiState by mutableStateOf(AmphibianUiState.Loading)
        private set

    init{
        getAmphibiansData()
    }


    fun getAmphibiansData(){
        viewModelScope.launch{
            amphibiansUiState = try {
                AmphibianUiState.Success(repository.getData())
            } catch (e: IOException) {
                AmphibianUiState.Error
            } catch (e: HttpException){
                AmphibianUiState.Error
            }
        }
    }

}