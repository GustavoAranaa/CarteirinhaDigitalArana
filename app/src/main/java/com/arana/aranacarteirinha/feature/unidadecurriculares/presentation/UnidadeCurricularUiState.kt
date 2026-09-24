package com.arana.aranacarteirinha.feature.unidadecurriculares.presentation

import com.arana.aranacarteirinha.feature.unidadecurriculares.domain.model.UnidadeCurricular

data class UnidadeCurricularUiState(
    val listaUnidadesCurriculares: List<UnidadeCurricular> = emptyList(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
) {
}