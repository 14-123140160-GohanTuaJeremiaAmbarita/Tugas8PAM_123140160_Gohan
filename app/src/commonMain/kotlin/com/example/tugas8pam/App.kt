package com.example.tugas8pam

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.tugas8pam.ui.MainScreen
import org.koin.compose.KoinApplication
import com.example.tugas8pam.di.appModules

/**
 * Entry point UI aplikasi menggunakan Compose Multiplatform.
 * Menggunakan KoinApplication wrapper untuk injeksi di level Compose.
 */
@Composable
fun App() {
    KoinApplication(application = {
        modules(appModules)
    }) {
        MaterialTheme {
            // Asumsi MainScreen sudah didefinisikan di commonMain
            MainScreen()
        }
    }
}
