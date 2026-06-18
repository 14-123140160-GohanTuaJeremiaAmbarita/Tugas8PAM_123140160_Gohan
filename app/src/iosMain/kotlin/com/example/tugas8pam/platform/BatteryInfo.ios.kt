package com.example.tugas8pam.platform

import platform.UIKit.UIDevice
import platform.UIKit.UIDeviceBatteryState

/**
 * Implementasi BatteryInfo untuk iOS menggunakan UIDevice.
 */
actual class BatteryInfo {
    init {
        UIDevice.currentDevice.batteryMonitoringEnabled = true
    }

    actual fun getBatteryLevel(): Int {
        val level = UIDevice.currentDevice.batteryLevel
        return if (level < 0) 0 else (level * 100).toInt()
    }

    actual fun isCharging(): Boolean {
        val state = UIDevice.currentDevice.batteryState
        return state == UIDeviceBatteryState.UIDeviceBatteryStateCharging || 
               state == UIDeviceBatteryState.UIDeviceBatteryStateFull
    }
}
