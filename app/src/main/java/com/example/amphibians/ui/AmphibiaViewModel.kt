package com.example.amphibians.ui

import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.ViewModel
import com.example.amphibians.ui.model.AmphibiaModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class AmphibiaViewModel() : ViewModel() {

    private val _uiState: MutableStateFlow<AmphibiaModel> = MutableStateFlow(AmphibiaModel())

    val uiState = _uiState.asStateFlow()




}