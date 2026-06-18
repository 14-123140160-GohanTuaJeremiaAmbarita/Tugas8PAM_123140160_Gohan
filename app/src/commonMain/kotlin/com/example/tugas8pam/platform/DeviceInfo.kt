package com.example.tugas8pam.platform

/**
 * Interface untuk mendapatkan informasi perangkat di semua platform.
 */
expect class DeviceInfo() {
    fun getDeviceName(): String
    fun getOsVersion(): String
    fun getAppVersion(): String
}
