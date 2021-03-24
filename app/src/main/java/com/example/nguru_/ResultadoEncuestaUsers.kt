package com.example.nguru_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class ResultadoEncuestaUsers : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_encuesta_users)

        setup()
    }

    private fun setup() {

        title = "Resultados encuesta"

        var social = findViewById<TextView>(R.id.resultadoSocial)
        val bundle1 = intent.extras
        var social1 = bundle1?.getString("social")
        social.setText(social1)

        var economico = findViewById<TextView>(R.id.resultadoEconomico)
        val bundle2 = intent.extras
        var economico1 = bundle2?.getString("economico")
        economico.setText(economico1)

        var email = findViewById<TextView>(R.id.emailTextViewResult)
        val bundle = intent.extras
        var email2 = bundle?.getString("email")
        email.setText(email2)

        val bundleresul1 = intent.extras
        var result1 = bundleresul1 ?.getInt("resulpag1")

        val bundleresul2 = intent.extras
        var result2 = bundleresul2 ?.getInt("resulpag2")

        var valorx: Double = 0.0


        when(result1){
            0 -> {valorx = 0.0}
            5 -> {valorx = 47.5}
            10 -> {valorx = 95.0}
            15 -> {valorx =142.5}
            20 -> {valorx = 190.0}
            25 -> {valorx = 237.5}
            30 -> {valorx = 285.0}
            35 -> {valorx = 332.5}
            40 -> {valorx = 380.0}
            45 -> {valorx = 427.5}
            50 -> {valorx = 475.0}
            55 -> {valorx= 522.5}
            60 -> {valorx = 570.0}
            65 -> {valorx = 617.5}
            70 -> {valorx = 665.5}
            75 -> {valorx = 712.5}
            80 -> {valorx = 760.0}
            85 -> {valorx = 807.5}
            90 -> {valorx = 855.0}
            95 -> {valorx = 902.5}
            100 -> {valorx = 950.0}
        }

        var valory: Double = 0.0

        when(result2){
            0 -> {valory = 0.0}
            5 -> {valory = 47.5}
            10 -> {valory = 95.0}
            15 -> {valory =142.5}
            20 -> {valory = 190.0}
            25 -> {valory = 237.5}
            30 -> {valory = 285.0}
            35 -> {valory = 332.5}
            40 -> {valory = 380.0}
            45 -> {valory = 427.5}
            50 -> {valory = 475.0}
            55 -> {valory= 522.5}
            60 -> {valory = 570.0}
            65 -> {valory = 617.5}
            70 -> {valory = 665.5}
            75 -> {valory = 712.5}
            80 -> {valory = 760.0}
            85 -> {valory = 807.5}
            90 -> {valory = 855.0}
            95 -> {valory = 902.5}
            100 -> {valory = 950.0}
        }

        var imagenX = findViewById<ImageView>(R.id.x)

        imagenX.translationX = valorx.toFloat()
        imagenX.translationY = valory.toFloat()

        var siguiente = findViewById<Button>(R.id.eleccionesBoton)
        siguiente.setOnClickListener{
            val meVoy = Intent(this, EleccionesUsers::class.java)
            meVoy.putExtra("email", email.text.toString())
            startActivity(meVoy)
        }

    }





}