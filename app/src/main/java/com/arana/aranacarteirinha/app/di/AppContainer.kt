package com.arana.aranacarteirinha.app.di

import com.arana.aranacarteirinha.core.auth.AuthTokenStore
import com.arana.aranacarteirinha.feature.login.data.repository.LoginRepository
import com.arana.aranacarteirinha.feature.unidadecurriculares.domain.repository.UnidadeCurricularRepository

interface AppContainer {

    val loginRepository: LoginRepository

    val unidadeCurricularRepository: UnidadeCurricularRepository

    val authTokenStore: AuthTokenStore
}