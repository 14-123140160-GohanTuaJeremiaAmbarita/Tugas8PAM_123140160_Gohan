package com.example.tugas8pam.di

import com.example.tugas8pam.platform.DeviceInfo
import com.example.tugas8pam.platform.NetworkMonitor
import com.example.tugas8pam.platform.BatteryInfo
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

/**
 * Modul Koin spesifik Android.
 * Menggunakan androidContext() untuk memberikan Context ke dependencies.
 */
actual val platformModule = module {
    single { DeviceInfo() }
    single { NetworkMonitor(androidContext()) }
    single { BatteryInfo(androidContext()) }
}
