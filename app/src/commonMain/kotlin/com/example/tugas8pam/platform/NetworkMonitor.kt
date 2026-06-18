package com.example.tugas8pam.platform

import kotlinx.coroutines.flow.Flow

/**
 * Interface untuk memantau status koneksi jaringan secara real-time.
 */
expect class NetworkMonitor {
    fun isConnected(): Boolean
    fun observeConnectivity(): Flow<Boolean>
}
