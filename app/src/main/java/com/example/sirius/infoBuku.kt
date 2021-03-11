package com.example.sirius

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_info_buku.*

class infoBuku : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_buku)

        /*var nama = intent.getStringExtra(EXTRA_NAMAPENULIS) ?: "No-Name"
        var tahun = intent.getIntExtra(EXTRA_TAHUNTERBIT,0)
        var np = intent.getStringExtra(EXTRA_NAMAPENERBIT) ?: "No-Name"
        var genreb = intent.getStringExtra(EXTRA_GENRE) ?: "No-Name"*/

//        Untuk mengambil data
        var b =intent.getParcelableExtra<Buku>(EXTRA_BUKU)

//        Menampilkan data
        penulis.text = "Nama Penulis = ${b?.Penulis}"
        tahun1.text = "Tahun Terbit = ${b?.Tahun}"
        penerbit.text = "Nama Penerbit = ${b?.Penerbit}"
        genre.text = "Genre Buku = ${b?.Genre}"

    }
    public fun back(view: View) {
        var Intentbuku = Intent(this, MainActivity::class.java)
        startActivity(Intentbuku)
    }
}