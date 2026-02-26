package com.example.exercicio25_02

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: App iniciado")
        setContentView(R.layout.activity_main)

        val tvMensagem: TextView = findViewById(R.id.tvMensagem)
        val btnMudar: Button = findViewById(R.id.btnMudar)
        Log.d(TAG, "Views encontradas")

        //Array de cores
        val cores = arrayOf(
            Color.parseColor("#FFFFFF"), //BRANCO
            Color.parseColor("#E3F2FD"), //AZUL CLARO
            Color.parseColor("#FFF9C4"),  //AMARELO CLARO
            Color.parseColor("#F1F8E9"),  //VERDE CLARO
            Color.parseColor("#FCE4EC"),  //ROSA CLARO
        )

        var indice = 0
        var cliques = 0

        btnMudar.setOnClickListener {
            //Atualizar contador
            cliques++
            Log.i(TAG, "Botao Clicado: Total: $cliques")
            tvMensagem.text = "Cliques: $cliques"

            //Mudar cor de fundo
            indice = (indice+1) % cores.size
            findViewById<LinearLayout>(R.id.main).setBackgroundColor(cores[indice])
        }
    }

    override fun onStart(){
        super.onStart()
        Log.d(TAG, "onStart: tela visivel")
    }

    override fun onResume(){
        super.onResume()
        Log.d(TAG, "onResume: app em foco")
    }

    override fun onPause(){
        super.onPause()
        Log.d(TAG, "onPause: perdeu o foco")
    }
}