package com.example.tugas8pam.platform

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager

/**
 * Implementasi BatteryInfo untuk Android menggunakan BatteryManager.
 */
actual class BatteryInfo(private val context: Context) {
    private val intentFilter = IntentFilter(Intent.ACTION_BATTERY_CHANGED)
    private val batteryStatus: Intent? get() = context.registerReceiver(null, intentFilter)

    actual fun getBatteryLevel(): Int {
        val level = batteryStatus?.getIntExtra(BatteryManager.EXTRA_LEVEL, -1) ?: -1
        val scale = batteryStatus?.getIntExtra(BatteryManager.EXTRA_SCALE, -1) ?: -1
        return if (level == -1 || scale == -1) 0 else (level * 100 / scale.toFloat()).toInt()
    }

    actual fun isCharging(): Boolean {
        val status = batteryStatus?.getIntExtra(BatteryManager.EXTRA_STATUS, -1) ?: -1
        return status == BatteryManager.BATTERY_STATUS_CHARGING || status == BatteryManager.BATTERY_STATUS_FULL
    }
}
