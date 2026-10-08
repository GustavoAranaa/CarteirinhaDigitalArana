package com.arana.aranacarteirinha.app.di

import com.arana.aranacarteirinha.core.auth.SessionTokenStore
import com.arana.aranacarteirinha.core.network.NetworkClient
import com.arana.aranacarteirinha.feature.login.data.remote.service.AuthApi
import com.arana.aranacarteirinha.feature.login.data.repository.ApiLoginRepositoryImpl
import com.arana.aranacarteirinha.feature.login.data.repository.FakeAuthRepository
import com.arana.aranacarteirinha.feature.login.domain.repository.LoginRepository
import com.arana.aranacarteirinha.feature.unidadecurriculares.data.remote.service.UnidadeCurricularApi
import com.arana.aranacarteirinha.feature.unidadecurriculares.data.repository.ApiUnidadeCurricularRepositoryImpl
import com.arana.aranacarteirinha.feature.unidadecurriculares.domain.repository.UnidadeCurricularRepository


class DefaultAppContainer : AppContainer {
    override val sessionTokenStore : SessionTokenStore = SessionTokenStore()
    private val networkClient =
        NetworkClient(
            baseUrl = BASE_URL,
            sessionTokenStore = sessionTokenStore
        )

    private val authApi : AuthApi by lazy {
        networkClient.createPublic(
            AuthApi::class.java
        )
    }
    private val unidadeCurricularApi : UnidadeCurricularApi by lazy {
        networkClient.createAuthenticated(
            UnidadeCurricularApi::class.java
        )
    }
    override val loginRepository : LoginRepository by lazy {
        if (USE_FAKE_LOGIN_REPOSITORY ) {
            FakeAuthRepository()
        } else {
            ApiLoginRepositoryImpl(
                api = authApi
            )
        }
    }
    override val unidadeCurricularRepository : UnidadeCurricularRepository by lazy {
        ApiUnidadeCurricularRepositoryImpl(
            api = unidadeCurricularApi
        )
    }
    companion object {
        private const val BASE_URL = "http://10.0.2.2:8080/"
        private const val USE_FAKE_LOGIN_REPOSITORY = false
    }
}