package com.example.sirius

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sirius.Fragments.FragmentA
import com.example.sirius.Fragments.FragmentB
import com.example.sirius.Fragments.InterfaceData

class Reviews : AppCompatActivity(), InterfaceData {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reviews)

        val fragmentA = FragmentA()
        supportFragmentManager
            .beginTransaction().replace(R.id.fragmentContainer, fragmentA).commit()
    }

    override fun kirimData(editEdit: String) {
        val bundle = Bundle()
        bundle.putString("Pesan", editEdit)

        val transaksi = this.supportFragmentManager.beginTransaction()

        val fragmentB = FragmentB()
        fragmentB.arguments = bundle

        transaksi.replace(R.id.fragmentContainer, fragmentB)
        transaksi.commit()
    }
}