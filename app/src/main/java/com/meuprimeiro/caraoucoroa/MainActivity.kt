package com.meuprimeiro.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image_jogar.setOnClickListener{

            val intent = Intent (applicationContext, SegundaActivity::class.java)


            //gerar um número randomico
            val numero = Random().nextInt(2)

            //transferir as informações para outra activity
             intent.putExtra("numero", numero)

            startActivity(intent)

        }
    }
}