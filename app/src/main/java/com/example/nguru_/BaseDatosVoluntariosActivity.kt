package com.example.nguru_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.google.firebase.firestore.FirebaseFirestore

class BaseDatosVoluntariosActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_datos_voluntarios)

        setup()
    }

    private fun setup() {

        var nombre3 = findViewById<TextView>(R.id.nombreText1)
        val bundle = intent.extras
        var nombre = bundle?.getString("nombre")
        nombre3.setText(nombre)

        var usuario = findViewById<EditText>(R.id.userEdit)
        var voluntario = findViewById<EditText>(R.id.voluntaritoEdit)
        var pass = findViewById<EditText>(R.id.passwordEdit)

        val guardar = findViewById<Button>(R.id.guardar)
        val actualizar = findViewById<Button>(R.id.actualizar)
        val buscar = findViewById<Button>(R.id.buscar)
        val eliminar = findViewById<Button>(R.id.eliminar)


        guardar.setOnClickListener{
            if (usuario.text.isNotEmpty()) {
                db.collection("usuario").document(usuario.text.toString()).set(
                    hashMapOf("nombre" to voluntario.text.toString(), "password" to pass.text.toString()))
                showGood()
            }
        }

        buscar.setOnClickListener{
            if (usuario.text.isNotEmpty()) {
                db.collection("usuario").document(usuario.text.toString()).get()
                    .addOnSuccessListener {
                        voluntario.setText(it.get("nombre") as String?)
                        pass.setText(it.get("password") as String?)
                    }

            }else{
                    showError()
                    }
            }



        actualizar.setOnClickListener{
            if (usuario.text.isNotEmpty()) {
                db.collection("usuario").document(usuario.text.toString()).update(
                    hashMapOf(
                        "nombre" to voluntario.text.toString(),
                        "password" to pass.text.toString()) as Map<String, Any>)
                showGood()
            }else{
                showError()
            }
        }

        eliminar.setOnClickListener{
            if (usuario.text.isNotEmpty()) {
                db.collection("usuario").document(usuario.text.toString()).delete()
                voluntario.setText("")
                pass.setText("")
                showGood()
            }else{
                showError()
            }
        }

    }

    private fun showError(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("ID vacio, favor introduzca un ID")
        builder.setPositiveButton("Aceptar", null)
        val dialog = builder.create()
        dialog.show()
    }

    private fun showGood(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Logrado")
        builder.setMessage("Solicitud realizada con exito")
        builder.setPositiveButton("Aceptar", null)
        val dialog = builder.create()
        dialog.show()
    }

}