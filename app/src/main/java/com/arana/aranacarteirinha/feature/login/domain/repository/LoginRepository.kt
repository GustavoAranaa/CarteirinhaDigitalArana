package com.arana.aranacarteirinha.feature.login.domain.repository

import com.arana.aranacarteirinha.feature.login.domain.model.UsuarioLogado

interface LoginRepository {
    suspend fun login(login: String, senha: String): Result<UsuarioLogado>
}