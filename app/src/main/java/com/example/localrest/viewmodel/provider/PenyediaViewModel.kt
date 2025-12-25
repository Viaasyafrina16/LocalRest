package com.example.localrest.viewmodel.provider

import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.localrest.Repository.AplikasiDataSiswa
import com.example.localrest.viewmodel.EntryViewModel
import com.example.localrest.viewmodel.HomeViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import com.example.localrest.viewmodel.DetailViewModel
import com.example.localrest.viewmodel.EditViewModel

fun CreationExtras.aplikasiDataSiswa():AplikasiDataSiswa = (
        this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiDataSiswa
        )
object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer { HomeViewModel(aplikasiDataSiswa().container.repositoryDataSiswa) }
        initializer { EntryViewModel(aplikasiDataSiswa().container.repositoryDataSiswa) }
        initializer {
            DetailViewModel(
                this.createSavedStateHandle(),
                aplikasiDataSiswa().container.repositoryDataSiswa
            )
        }
        initializer {
            EditViewModel(
                this.createSavedStateHandle(),
                aplikasiDataSiswa().container.repositoryDataSiswa
            )
        }
    }
}