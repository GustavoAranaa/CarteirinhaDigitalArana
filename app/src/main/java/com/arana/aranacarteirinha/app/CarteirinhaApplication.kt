package com.arana.aranacarteirinha.app

import android.app.Application
import com.arana.aranacarteirinha.app.di.AppContainer
import com.arana.aranacarteirinha.app.di.DefaultAppContainer

class CarteirinhaApplication : Application() {
    val container: AppContainer by lazy {
        DefaultAppContainer()
    }
}