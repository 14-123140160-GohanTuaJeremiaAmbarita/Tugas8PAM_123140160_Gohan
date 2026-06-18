package com.example.tugas8pam.platform

import android.os.Build
import com.example.tugas8pam.BuildConfig

/**
 * Implementasi DeviceInfo untuk Android menggunakan Build API.
 */
actual class DeviceInfo actual constructor() {
    actual fun getDeviceName(): String = "${Build.MANUFACTURER} ${Build.MODEL}"
    actual fun getOsVersion(): String = "Android ${Build.VERSION.RELEASE} (API ${Build.VERSION.SDK_INT})"
    actual fun getAppVersion(): String = BuildConfig.VERSION_NAME
}
