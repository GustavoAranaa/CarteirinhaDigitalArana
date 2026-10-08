package com.arana.aranacarteirinha.app.di

import com.arana.aranacarteirinha.core.auth.SessionTokenStore
import com.arana.aranacarteirinha.feature.login.domain.repository.LoginRepository
import com.arana.aranacarteirinha.feature.unidadecurriculares.domain.repository.UnidadeCurricularRepository

interface AppContainer {
    val sessionTokenStore : SessionTokenStore

    val loginRepository : LoginRepository

    val unidadeCurricularRepository : UnidadeCurricularRepository
}