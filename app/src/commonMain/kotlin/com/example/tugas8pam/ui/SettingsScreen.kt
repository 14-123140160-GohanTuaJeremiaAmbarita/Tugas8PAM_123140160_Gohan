package com.example.tugas8pam.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tugas8pam.platform.DeviceInfo
import com.example.tugas8pam.platform.BatteryInfo
import org.koin.compose.koinInject

@Composable
fun SettingsScreen() {
    // Injeksi menggunakan Koin di dalam Composable
    val deviceInfo: DeviceInfo = koinInject()
    val batteryInfo: BatteryInfo = koinInject()

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ) {
        Text(
            text = "System Information",
            style = MaterialTheme.typography.headlineMedium
        )
        
        Spacer(Modifier.height(16.dp))
        
        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Device: ${deviceInfo.getDeviceName()}")
                Text("OS: ${deviceInfo.getOsVersion()}")
                Text("App Version: ${deviceInfo.getAppVersion()}")
                
                HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                
                Text("Battery Level: ${batteryInfo.getBatteryLevel()}%")
                Text("Charging Status: ${if (batteryInfo.isCharging()) "Charging" else "Not Charging"}")
            }
        }
    }
}
