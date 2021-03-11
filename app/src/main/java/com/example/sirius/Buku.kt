package com.example.sirius

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

//Implementasi Parcelable : berpindah Activity dengan membawa Objek
@Parcelize
data class Buku(var Penulis : String ="No-Name",
                var Tahun : Int =0,
                var Penerbit : String ="No-Name",
                var Genre : String ="Tidak Ada") : Parcelable {
}