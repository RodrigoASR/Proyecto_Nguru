package com.example.nguru_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.google.firebase.firestore.FirebaseFirestore

class VoluntariosActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_voluntarios)

        setup()
    }

    private fun setup() {
        title = "               Bienvenidos Voluntarios"
        var acces = findViewById<Button>(R.id.accesoButton)
        var usuario = findViewById<EditText>(R.id.usuarioEdit)
        var pass = findViewById<EditText>(R.id.passEdit)


        acces.setOnClickListener {

            if (usuario.text.isNotEmpty() && pass.text.isNotEmpty()){
                db.collection("usuario").document(usuario.text.toString()).get()
                    .addOnSuccessListener {
                        var nombre = it.get("nombre") as String?
                        var password = it.get("password") as String?

                        if (pass.text.toString() == password){
                            var acceso = Intent(this, EleccionesVoluntarios::class.java)
                            acceso.putExtra("nombre", nombre)
                            startActivity(acceso)
                        }else{
                            showError2()
                        }
                    }


                }else{
                    showError()


            }



        }
    }

    private fun showError(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("usuario o contraseña vacios")
        builder.setPositiveButton("Aceptar", null)
        val dialog = builder.create()
        dialog.show()
    }

    private fun showError2(){
        val builder2 = AlertDialog.Builder(this)
        builder2.setTitle("Error")
        builder2.setMessage("usuario o contraseña incorrecto")
        builder2.setPositiveButton("Aceptar", null)
        val dialog2 = builder2.create()
        dialog2.show()
    }
}