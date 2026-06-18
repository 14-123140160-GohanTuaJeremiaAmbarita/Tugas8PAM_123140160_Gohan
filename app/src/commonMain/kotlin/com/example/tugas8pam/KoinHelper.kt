package com.example.tugas8pam

import com.example.tugas8pam.di.appModules
import org.koin.core.context.startKoin

/**
 * Helper function untuk inisialisasi Koin dari sisi iOS (AppDelegate).
 */
fun initKoin() {
    startKoin {
        modules(appModules)
    }
}
