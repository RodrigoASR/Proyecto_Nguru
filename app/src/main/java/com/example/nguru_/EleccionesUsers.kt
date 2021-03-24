package com.example.nguru_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class EleccionesUsers : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elecciones_users)

        setup()
    }

    private fun setup(){

        val constituyentes = findViewById<Button>(R.id.constiButtonNada)
        val alcaldes = findViewById<Button>(R.id.alcaldesButtonNada)
        val consejales = findViewById<Button>(R.id.consejalesButtonNada)
        val gobernador = findViewById<Button>(R.id.gobernadoresButtonNada)
        val presidentes = findViewById<Button>(R.id.presidentesButtonNada)

        val distrito = findViewById<TextView>(R.id.distritoUser)
        val nombre = findViewById<TextView>(R.id.nombreTextView)

        val email = findViewById<TextView>(R.id.emailtxtView)
        val bundle = intent.extras
        val email2 = bundle?.getString("email")
        email.setText(email2)

        db.collection("user").document(email.text.toString()).get()
            .addOnSuccessListener {
                nombre.setText(it.get("nombre") as String?)
                distrito.setText(it.get("distrito") as String?)

            }


        constituyentes.setOnClickListener{
            val goConstituyentes = Intent(this, ConstituyentesDB::class.java)
            goConstituyentes.putExtra("distrito", distrito.text.toString())
            goConstituyentes.putExtra("email", email.text.toString())
            startActivity(goConstituyentes)
        }

    }
}