package com.example.amphibians.ui


import androidx.lifecycle.ViewModel
import com.example.amphibians.ui.model.Amphibian


sealed interface AmphibianUiState{
    data class Success(val amphibians : List<Amphibian>) : AmphibianUiState
    object Loading : AmphibianUiState
    object Error : AmphibianUiState

}

class AmphibianViewModel() : ViewModel() {




}