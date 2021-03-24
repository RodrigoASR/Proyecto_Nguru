package com.example.nguru_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import java.io.BufferedReader

class CandidatosActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_candidatos)

        setup()
    }

    private fun setup(){
        val id = findViewById<EditText>(R.id.idEdtit)

        val constiButton = findViewById<Button>(R.id.constituyentesCandidatos)
        val alcaldesButton = findViewById<Button>(R.id.alcandesCandidatos)
        val consejalesButton = findViewById<Button>(R.id.concejalesCandidatos)
        val gobernadoresButton = findViewById<Button>(R.id.gobernadoresCandidatos)
        val presidentesButton = findViewById<Button>(R.id.presidencialesCandidatos)



        constiButton.setOnClickListener{
            val baseDatos = 1
            if(id.text.toString().isNotEmpty()) {

            db.collection("constituyentes").document(id.text.toString()).get()
                    .addOnSuccessListener {

                        var idCandi = it.get("id") as String?

                        if (id.text.toString() == idCandi){
                            val goConsti = Intent(this, CandiDatosConstituyentes::class.java)
                            goConsti.putExtra("datos", baseDatos)
                            goConsti.putExtra("id",idCandi)
                            startActivity(goConsti)
                        }else{
                            showError()
                        }

                    }

                }else{
                    showError2()
            }



        }


        alcaldesButton.setOnClickListener{
            val baseDatos = 2
            if(id.text.toString().isNotEmpty()) {

                db.collection("alcaldes").document(id.text.toString()).get()
                    .addOnSuccessListener {

                        var idCandi = it.get("id") as String?

                        if (id.text.toString() == idCandi){
                            val goConsti = Intent(this, CandiDatosConstituyentes::class.java)
                            goConsti.putExtra("datos", baseDatos)
                            goConsti.putExtra("id",idCandi)
                            startActivity(goConsti)
                        }else{
                            showError()
                        }

                    }

            }else{
                showError2()
            }
        }



        consejalesButton.setOnClickListener{
            val baseDatos = 3
            if(id.text.toString().isNotEmpty()) {

                db.collection("consejales").document(id.text.toString()).get()
                    .addOnSuccessListener {

                        var idCandi = it.get("id") as String?

                        if (id.text.toString() == idCandi){
                            val goConsti = Intent(this, CandiDatosConstituyentes::class.java)
                            goConsti.putExtra("datos", baseDatos)
                            goConsti.putExtra("id",idCandi)
                            startActivity(goConsti)
                        }else{
                            showError()
                        }

                    }

            }else{
                showError2()
            }
        }


        gobernadoresButton.setOnClickListener{
            val baseDatos = 4
            if(id.text.toString().isNotEmpty()) {

                db.collection("gobernadores").document(id.text.toString()).get()
                    .addOnSuccessListener {

                        var idCandi = it.get("id") as String?

                        if (id.text.toString() == idCandi){
                            val goConsti = Intent(this, CandiDatosConstituyentes::class.java)
                            goConsti.putExtra("datos", baseDatos)
                            goConsti.putExtra("id",idCandi)
                            startActivity(goConsti)
                        }else{
                            showError()
                        }

                    }

            }else{
                showError2()
            }
        }

        presidentesButton.setOnClickListener{
            val baseDatos = 5
            if(id.text.toString().isNotEmpty()) {

                db.collection("presidentes").document(id.text.toString()).get()
                    .addOnSuccessListener {

                        var idCandi = it.get("id") as String?

                        if (id.text.toString() == idCandi){
                            val goConsti = Intent(this, CandiDatosConstituyentes::class.java)
                            goConsti.putExtra("datos", baseDatos)
                            goConsti.putExtra("id",idCandi)
                            startActivity(goConsti)
                        }else{
                            showError()
                        }

                    }

            }else{
                showError2()
            }
        }



    }

    private fun showError(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("el ID no existe")
        builder.setPositiveButton("Aceptar", null)
        val dialog = builder.create()
        dialog.show()}

    private fun showError2(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("el ID no puede estar vacio")
        builder.setPositiveButton("Aceptar", null)
        val dialog = builder.create()
        dialog.show()}

}

