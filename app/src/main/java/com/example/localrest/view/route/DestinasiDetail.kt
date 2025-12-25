package com.example.localrest.view.route

import com.example.localrest.R

object DestinasiDetail : DestinasiNavigasi {
    override val route = "Detail_siswa"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{itemIdArg}"
}