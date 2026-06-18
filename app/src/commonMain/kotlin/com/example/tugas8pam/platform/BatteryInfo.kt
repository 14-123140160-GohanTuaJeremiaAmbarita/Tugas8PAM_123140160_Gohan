package com.example.tugas8pam.platform

/**
 * Interface untuk mendapatkan status baterai perangkat.
 */
expect class BatteryInfo {
    fun getBatteryLevel(): Int
    fun isCharging(): Boolean
}
