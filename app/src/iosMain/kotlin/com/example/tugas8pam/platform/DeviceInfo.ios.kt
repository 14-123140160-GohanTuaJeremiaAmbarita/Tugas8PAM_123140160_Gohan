package com.example.tugas8pam.platform

import platform.UIKit.UIDevice
import platform.Foundation.NSBundle

/**
 * Implementasi DeviceInfo untuk iOS menggunakan UIDevice dan NSBundle.
 */
actual class DeviceInfo actual constructor() {
    actual fun getDeviceName(): String = UIDevice.currentDevice.name
    actual fun getOsVersion(): String = "${UIDevice.currentDevice.systemName} ${UIDevice.currentDevice.systemVersion}"
    
    actual fun getAppVersion(): String {
        return NSBundle.mainBundle.infoDictionary?.get("CFBundleShortVersionString") as? String ?: "1.0.0"
    }
}
