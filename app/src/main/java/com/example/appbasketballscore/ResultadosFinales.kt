package com.example.appbasketballscore;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appbasketballscore.databinding.ActivityResultadosFinalesBinding

class ResultadosFinales : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityResultadosFinalesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras!!
        val locales = bundle.getInt("puntosLocal").toString()
        val visitas = bundle.getInt("puntosVisita").toString()

        binding.marcadorLocal.text = locales
        binding.marcadorVisitante.text = visitas

        if(Integer.parseInt(locales) == Integer.parseInt(visitas)){
            binding.resultado.text = "Empate"
            return
        }

        binding.resultado.text = if (Integer.parseInt(locales) > Integer.parseInt(visitas)) "¡Locales ganan!" else "¡Visitantes ganan!"
    }
}