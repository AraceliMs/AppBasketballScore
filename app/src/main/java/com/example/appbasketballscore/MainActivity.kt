package com.example.appbasketballscore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appbasketballscore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.terminar.setOnClickListener {
            val puntosDeLocal = binding.marcadorUno.text.toString().toInt()
            val puntosDeVisita = binding.marcadordos.text.toString().toInt()
            val intent = Intent(this, ResultadosFinales::class.java)

            intent.putExtra("puntosLocal", puntosDeLocal)
            intent.putExtra("puntosVisita", puntosDeVisita)
            startActivity(intent)
        }

        binding.botonReiniciar.setOnClickListener {
            binding.marcadordos.text = "0"
            binding.marcadorUno.text = "0"
        }

        binding.puntoLocal.setOnClickListener {
            val punto = binding.marcadorUno.text.toString().toInt()
            binding.marcadorUno.text = (punto +  1).toString()
        }
        binding.dosPuntosLocal.setOnClickListener {
            val puntos = binding.marcadorUno.text.toString().toInt()
            binding.marcadorUno.text = (puntos +  2).toString()
        }
        binding.menosUnoLocal.setOnClickListener {
            val punto = binding.marcadorUno.text.toString().toInt()
            binding.marcadorUno.text = if(punto == 0) "0" else (punto -  1).toString()
        }

        binding.puntoVisitante.setOnClickListener {
            val punto = binding.marcadordos.text.toString().toInt()
            binding.marcadordos.text = (punto +  1).toString()
        }
        binding.dosPuntosVisitante.setOnClickListener {
            val puntos = binding.marcadordos.text.toString().toInt()
            binding.marcadordos.text = (puntos +  2).toString()
        }
        binding.menosUnoVisitante.setOnClickListener {
            val punto = binding.marcadordos.text.toString().toInt()
            binding.marcadordos.text = if(punto == 0) "0" else (punto -  1).toString()
        }
    }
}