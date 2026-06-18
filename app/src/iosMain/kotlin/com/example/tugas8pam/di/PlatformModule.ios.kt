package com.example.tugas8pam.di

import com.example.tugas8pam.platform.DeviceInfo
import com.example.tugas8pam.platform.NetworkMonitor
import com.example.tugas8pam.platform.BatteryInfo
import org.koin.dsl.module

/**
 * Modul Koin spesifik iOS.
 */
actual val platformModule = module {
    single { DeviceInfo() }
    single { NetworkMonitor() }
    single { BatteryInfo() }
}
