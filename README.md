# LAPORAN PRAKTIKUM MOBILE APP DEVELOPMENT - WEEK 8
**Notes App: Kotlin Multiplatform + Compose Multiplatform**

**Identitas Mahasiswa:**
- **Nama:** Gohan Tua Jeremia Ambarita
- **NIM:** 123140160
- **Tahun:** 2026

---

## 🎯 Poin Utama & Fitur

### 1. Dependency Injection (Koin Ecosystem)
*   **Centralized DI**: Menggunakan Koin v3.5.3 untuk mengelola seluruh siklus hidup objek (Database, Repository, ViewModel).
*   **Platform Specific Modules**: Pemisahan `commonModule` untuk logika bisnis dan `platformModule` untuk dependensi native yang memerlukan Context (Android).
*   **Modern ViewModel**: Implementasi `viewModelOf` untuk integrasi otomatis lifecycle ViewModel pada Compose Multiplatform.
*   **Native Initialization**: Inisialisasi Koin melalui `MyApplication` (Android) dan `initKoin` helper untuk iOS (AppDelegate).

### 2. Integrasi Hardware & OS (Expect/Actual)
*   **DeviceInfo**: Abstraksi native untuk mengambil data model perangkat, versi OS, dan versi aplikasi secara dinamis.
*   **Network Monitor**: Monitoring status internet secara real-time menggunakan Kotlin Flow. 
    *   *Android*: Menggunakan `ConnectivityManager` + `callbackFlow`.
    *   *iOS*: Menggunakan `NWPathMonitor` dari framework Network.
*   **Battery Info [BONUS]**: Fitur tambahan untuk mendeteksi persentase baterai dan status pengisian daya (*charging state*) menggunakan API native masing-masing platform.

### 3. User Interface & Reactive UI
*   **Network Status Indicator**: Komponen UI di `MainScreen` yang menggunakan `AnimatedVisibility` untuk memberi peringatan otomatis saat perangkat offline.
*   **System Dashboard**: Halaman `SettingsScreen` yang menyatukan seluruh informasi perangkat (Hardware, OS, Battery) dalam tampilan Card.

---

## 🏗️ Keputusan Arsitektur

*   **Clean Architecture**: Interface didefinisikan di `commonMain`, memastikan *business logic* tetap murni dan platform-independent.
*   **Context Safety**: Implementasi pada Android menggunakan `androidContext` (Application-level) untuk mencegah *memory leaks*.
*   **Reactive Stream**: Penggunaan `Flow` untuk monitoring jaringan memastikan penggunaan resource yang efisien.
*   **Production Standard**: Kode disusun dengan pemisahan layer yang jelas untuk mempermudah skalabilitas.

---
*Laporan ini disusun untuk memenuhi standar tugas praktikum Mobile App Development Week 8.*