package com.example.tugas8pam.platform

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import platform.Network.*
import platform.darwin.dispatch_get_main_queue

/**
 * Implementasi NetworkMonitor untuk iOS menggunakan NWPathMonitor.
 */
actual class NetworkMonitor {
    private val monitor = nw_path_monitor_create()
    private val _status = MutableStateFlow(true)

    init {
        nw_path_monitor_set_update_handler(monitor) { path ->
            val isSatisfied = nw_path_get_status(path) == nw_path_status_satisfied
            _status.value = isSatisfied
        }
        nw_path_monitor_start(monitor)
    }

    actual fun isConnected(): Boolean = _status.value
    actual fun observeConnectivity(): Flow<Boolean> = _status
}
