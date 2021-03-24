package com.example.nguru_

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.core.view.marginLeft
import androidx.core.view.marginRight
import androidx.core.view.marginTop

class EleccionesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elecciones)

        setup()
    }


    private fun setup(){
        title = "                 Próximas Elecciones"

        var constituyentes = findViewById<Button>(R.id.constiButtonNada)
        var alcades = findViewById<Button>(R.id.alcaldesButtonNada)
        var consejales = findViewById<Button>(R.id.consejalesButtonNada)
        var gobernadores = findViewById<Button>(R.id.gobernadoresButtonNada)
        var presidentes = findViewById<Button>(R.id.presidentesButtonNada)

        var sistema = findViewById<Button>(R.id.sistemaButton)
        var genero = findViewById<Button>(R.id.generoButton)
        var indigena = findViewById<Button>(R.id.indigenasButton)


        constituyentes.setOnClickListener{
            var goConsti = Intent(this, BaseDatosC::class.java)
            startActivity(goConsti)
        }



    }
}