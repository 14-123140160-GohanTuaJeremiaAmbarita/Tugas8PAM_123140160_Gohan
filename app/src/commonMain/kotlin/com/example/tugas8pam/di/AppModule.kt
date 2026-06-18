package com.example.tugas8pam.di

import com.example.tugas8pam.database.AppDatabase
import com.example.tugas8pam.repository.NoteRepository
import com.example.tugas8pam.repository.SettingsRepository
import com.example.tugas8pam.viewmodel.NotesViewModel
import com.example.tugas8pam.viewmodel.SettingsViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

/**
 * Modul Koin untuk common source set.
 * Mengelola dependency yang dibagikan antar platform.
 */
val commonModule = module {
    // Database & Repositories
    // AppDatabase membutuhkan DatabaseDriver yang disediakan via platformModule
    single { AppDatabase(get()) }
    single { NoteRepository(get()) }
    single { SettingsRepository(get()) }

    // ViewModels menggunakan viewModelOf untuk integrasi Compose Multiplatform
    viewModelOf(::NotesViewModel)
    viewModelOf(::SettingsViewModel)
}

// Helper untuk menggabungkan modul
expect val platformModule: org.koin.core.module.Module

val appModules = listOf(commonModule, platformModule)
