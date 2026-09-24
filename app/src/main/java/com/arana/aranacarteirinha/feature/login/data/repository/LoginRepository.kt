package com.arana.aranacarteirinha.feature.login.data.repository

import com.arana.aranacarteirinha.feature.login.domain.model.UsuarioLogado

interface LoginRepository {
    suspend fun login( usuario:String, senha:String): Result<UsuarioLogado>
}