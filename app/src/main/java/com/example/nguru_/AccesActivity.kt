package com.example.nguru_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AccesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acces)

        setup()
    }

    private fun setup(){
        title ="     Acceso Restringido"

        var candidatos = findViewById<Button>(R.id.candiButton)
        var voluntarios = findViewById<Button>(R.id.voluButton)
        var admin = findViewById<Button>(R.id.adminButton)

        voluntarios.setOnClickListener{
            var voluintent = Intent(this, VoluntariosActivity::class.java)
            startActivity(voluintent)
        }

        admin.setOnClickListener{
            val adminInten = Intent(this, AdminActivity::class.java)
            startActivity(adminInten)
        }

        candidatos.setOnClickListener{
            val candi = Intent(this, CandidatosActivity::class.java)
            startActivity(candi)
        }
    }

}

