package com.xyzlabs.luaskotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_luas.setOnClickListener { view ->
            Luas()
        }
    }

    fun Luas() {
        try {
            val p:Double = edt_panjang.text.toString().toDouble()
            val l:Double = edt_lebar.text.toString().toDouble()
            val Luas = p * l
            txt_luas.text = Luas.toString()
        }catch (e: NumberFormatException){
            e.printStackTrace()
        }
    }

}
