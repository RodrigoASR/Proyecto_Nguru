package com.example.nguru_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.io.BufferedReader

class EleccionesVoluntarios : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elecciones_voluntarios)

        setup()
    }

    private fun setup(){


        val bundle = intent.extras
        var nombre = bundle?.getString("nombre")


        var constituyentes = findViewById<Button>(R.id.constituyentesBtn)
        var alcaldes = findViewById<Button>(R.id.alcaldesBtn)
        var consejales = findViewById<Button>(R.id.consejalesBtn)
        var gobernadores = findViewById<Button>(R.id.gobernadoresBtn)
        var presidencial = findViewById<Button>(R.id.presidencialBtn)

        constituyentes.setOnClickListener{
            var consti = Intent(this, BaseDatosActivity::class.java)
            consti.putExtra("nombre", nombre)
            startActivity(consti)
        }

        alcaldes.setOnClickListener{
            var alcal = Intent(this, AlcaldesActivity::class.java)
            alcal.putExtra("nombre", nombre)
            startActivity(alcal)
        }

        consejales.setOnClickListener{
            val conse = Intent(this, ConcejalesActivity::class.java)
            conse.putExtra("nombre", nombre)
            startActivity(conse)
        }

        gobernadores.setOnClickListener{
            val gober = Intent(this, GobernadorActivity::class.java)
            gober.putExtra("nombre", nombre)
            startActivity(gober)
        }

        presidencial.setOnClickListener{
            val presi = Intent(this, PresidentesActivity::class.java)
            presi.putExtra("nombre", nombre)
            startActivity(presi)
        }

    }
}