package com.arana.aranacarteirinha.feature.unidadecurriculares.domain.repository

import com.arana.aranacarteirinha.feature.unidadecurriculares.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun listarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}