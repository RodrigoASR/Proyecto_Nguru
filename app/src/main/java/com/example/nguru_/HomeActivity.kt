package com.example.nguru_

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isEmpty
import androidx.core.view.isNotEmpty
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore


class HomeActivity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setup()
    }


    private fun setup(){
        title = "          Condiciones del servicio"

        val logOut = findViewById<Button>(R.id.logOutButton)
        val acept = findViewById<Button>(R.id.aceptButton)
        var check = findViewById<View>(R.id.checkBox) as CheckBox
        var spin1 = findViewById<View>(R.id.regionSpinner) as Spinner
        var spin2 = findViewById<View>(R.id.comunaSpinner) as Spinner
        var distrito = findViewById<TextView>(R.id.distritoText)
        var genero = findViewById<Spinner>(R.id.generoSpinner)
        var provincial = findViewById<TextView>(R.id.provincial)
        var nombre = findViewById<EditText>(R.id.nombreEditText)
        var edad = findViewById<EditText>(R.id.edadText)
        var apellidos = findViewById<EditText>(R.id.EditTextApellido)
        var email = findViewById<EditText>(R.id.emailText)
        var pass = findViewById<EditText>(R.id.pass1)
        var pass2 = findViewById<EditText>(R.id.pass2)




        val adapterGenero: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.genero,android.R.layout.simple_spinner_item)
        genero.adapter = adapterGenero


        val adapter: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.regiones,android.R.layout.simple_spinner_item)
        spin1.adapter = adapter


        //******comienza configuracion Spinner 2, comunas ********
        spin1.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (position == 0){
                    val arica: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext , R.array.arica, android.R.layout.simple_spinner_item)
                    spin2.adapter = arica
                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
                        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                            if (position == 0 || position == 1){
                                distrito.setText("1")
                                provincial.setText("Arica")
                            }

                            if (position == 2 || position ==3){
                                distrito.setText("2")
                                provincial.setText("Parinacota")
                            }

                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }


                    }
                }
                if(position == 1){
                    val tarapaca: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.tarapaca, android.R.layout.simple_spinner_item)
                    spin2.adapter = tarapaca

                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long
                        ) {
                            if (position == 0 || position == 1) {
                                distrito.setText("2")
                                provincial.setText("Iquique")
                            }

                            if (position == 2 || position == 3 || position == 4 || position == 5 || position == 6) {
                                distrito.setText("2")
                                provincial.setText("Tamarugal")
                            }

                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }
                    }
                }
                if(position == 2){
                    val antofagasta: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.antofagasta, android.R.layout.simple_spinner_item)
                    spin2.adapter = antofagasta
                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long
                        ) {
                            if (position == 0 || position == 1 || position == 2 || position == 3) {
                                distrito.setText("3")
                                provincial.setText("Antofagasta")
                            }

                            if (position == 4 || position == 5 || position == 6) {
                                distrito.setText("3")
                                provincial.setText("El Loa")
                            }
                            if (position == 7 || position == 8) {
                                distrito.setText("3")
                                provincial.setText("Tocopilla")
                            }

                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }
                    }
                }
                if(position == 3){
                    val atacama: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.Atacama, android.R.layout.simple_spinner_item)
                    spin2.adapter = atacama

                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long
                        ) {
                            if (position == 0 || position == 1) {
                                distrito.setText("4")
                                provincial.setText("Chañaral")
                            }

                            if (position == 2 || position == 3 || position == 4) {
                                distrito.setText("4")
                                provincial.setText("Copiapo")
                            }
                            if (position == 5 || position == 6 || position == 7 || position == 8) {
                                distrito.setText("4")
                                provincial.setText("Huasco")
                            }

                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }
                    }
                }
                if(position == 4){
                    val coquimbo: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.Coquimbo, android.R.layout.simple_spinner_item)
                    spin2.adapter = coquimbo

                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long
                        ) {
                            if (position == 0 || position == 1 || position == 2 || position == 3) {
                                distrito.setText("5")
                                provincial.setText("Choapa")
                            }

                            if (position == 4 || position == 5 || position == 6 || position == 7 || position == 8 || position == 9) {
                                distrito.setText("5")
                                provincial.setText("Elqui")
                            }
                            if (position == 10 || position == 11 || position == 12 || position == 13 || position == 14) {
                                distrito.setText("5")
                                provincial.setText("Limari")
                            }

                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }
                    }

                }
                if(position == 5){
                    val valparaiso: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.Valparaiso, android.R.layout.simple_spinner_item)
                    spin2.adapter = valparaiso

                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long
                        ) {
                            if (position == 0 || position == 1 || position == 2 || position == 3) {
                                distrito.setText("6")
                                provincial.setText("Los Andes")
                            }

                            if (position == 4 || position == 5 || position == 6 || position == 7) {
                                distrito.setText("6")
                                provincial.setText("Marga Marga")
                            }
                            if (position == 8 || position == 9 || position == 10 || position == 11 || position == 12) {
                                distrito.setText("6")
                                provincial.setText("Petorca")
                            }
                            if (position == 13 || position == 14 || position == 15 || position == 16 || position == 17) {
                                distrito.setText("6")
                                provincial.setText("Quillota")
                            }
                            if (position == 18 || position == 19 || position == 20 || position == 21 || position == 22 || position == 23) {
                                distrito.setText("6")
                                provincial.setText("San Felipe")
                            }
                            if (position == 24 || position == 25) {
                                distrito.setText("6")
                                provincial.setText("Valparaiso I")
                            }
                            if (position == 26){
                                distrito.setText("7")
                                provincial.setText("Isla de Pascua")
                            }
                            if (position == 27 || position == 28 || position == 29 || position == 30 || position == 31 || position == 32) {
                                distrito.setText("7")
                                provincial.setText("San Antonio")
                            }
                            if (position == 33 || position == 34) {
                                distrito.setText("7")
                                provincial.setText("Valparaiso I")
                            }
                            if (position == 35 || position == 36 || position == 37) {
                                distrito.setText("7")
                                provincial.setText("Valparaiso II")
                            }

                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }
                    }


                }
                if(position == 6){
                    val metro: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.Metropolitana, android.R.layout.simple_spinner_item)
                    spin2.adapter = metro

                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long
                        ) {
                            if (position == 0 || position == 1 || position  == 2) {
                                distrito.setText("8")
                                provincial.setText("Chacabuco")
                            }

                            if (position == 3 || position == 4) {
                                distrito.setText("8")
                                provincial.setText("Santiago I")
                            }
                            if (position == 5 || position == 6 || position  == 7) {
                                distrito.setText("8")
                                provincial.setText("Santiago III")
                            }
                            if (position == 8 || position == 9 || position  == 10) {
                                distrito.setText("9")
                                provincial.setText("Santiago I")
                            }
                            if (position == 11 || position == 12 || position  == 13 || position  == 14 || position  == 15) {
                                distrito.setText("9")
                                provincial.setText("Santiago II")
                            }
                            if(position == 16){
                                distrito.setText("10")
                                provincial.setText("Santiago II")
                            }
                            if (position == 17 || position == 18) {
                                distrito.setText("10")
                                provincial.setText("Santiago IV")
                            }
                            if (position == 19 || position == 20 || position  == 21) {
                                distrito.setText("10")
                                provincial.setText("Santiago V")
                            }
                            if (position == 22 || position == 23 || position  == 24 || position ==25) {
                                distrito.setText("11")
                                provincial.setText("Santiago IV")
                            }
                            if (position == 26) {
                                distrito.setText("11")
                                provincial.setText("Santiago IV")
                            }
                            if (position == 27 || position == 28 || position  == 29) {
                                distrito.setText("12")
                                provincial.setText("Cordillera")
                            }
                            if (position == 30) {
                                distrito.setText("12")
                                provincial.setText("Santiago V")
                            }
                            if (position == 31) {
                                distrito.setText("12")
                                provincial.setText("Santiago VI")
                            }
                            if (position == 32 || position  == 33 || position ==34 || position == 35 || position == 36 || position == 37) {
                                distrito.setText("13")
                                provincial.setText("Santiago VI")
                            }
                            if (position == 38 || position == 39 || position  == 40 || position == 41) {
                                distrito.setText("14")
                                provincial.setText("Maipo")
                            }
                            if (position == 42 || position == 43 || position  == 44 || position == 45 || position == 46) {
                                distrito.setText("14")
                                provincial.setText("Melipilla")
                            }
                            if (position == 47 || position == 48 || position  == 49 || position  == 50 || position  == 51) {
                                distrito.setText("14")
                                provincial.setText("Talagante")
                            }
                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }
                    }


                }
                if(position == 7){
                    val liber: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.Libertador, android.R.layout.simple_spinner_item)
                    spin2.adapter = liber

                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long
                        ) {
                            if (position == 0) {
                                distrito.setText("15")
                                provincial.setText("Cachapoal I")
                            }
                            if (position == 1 || position == 2 || position == 3 || position == 4 || position == 5 || position == 6 || position == 7 || position == 8 || position == 9 || position == 10 || position == 11 || position == 12) {
                                distrito.setText("15")
                                provincial.setText("Cachapoal II")
                            }
                            if (position == 13 || position == 14 || position == 15 || position == 16){
                                distrito.setText("16")
                                provincial.setText("Cachapoal II")
                            }
                            if (position == 17 || position == 18 || position == 19 || position == 20 || position == 21 || position == 22){
                                distrito.setText("16")
                                provincial.setText("Cardenal Caro")
                            }
                            if (position == 21 || position == 22 || position == 23 || position == 24 || position == 25 || position == 26 || position == 27 || position == 28 || position == 29 || position == 30 || position == 31 || position == 32){
                                distrito.setText("16")
                                provincial.setText("Colchagua")
                            }

                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }
                    }

                }
                if(position == 8){
                    val maule: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.maule, android.R.layout.simple_spinner_item)
                    spin2.adapter = maule

                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long
                        ) {
                            if (position == 0 || position == 1 || position == 2 || position == 3 || position == 4 || position == 5 || position == 6 || position == 7 || position == 8) {
                                distrito.setText("17")
                                provincial.setText("Curico")
                            }

                            if (position == 9 || position == 10 || position == 11 || position == 12 || position == 13 || position == 14 || position == 15 || position == 16 || position == 17 || position == 18) {
                                distrito.setText("17")
                                provincial.setText("Talca")
                            }
                            if (position == 19 || position == 20 || position == 21){
                                distrito.setText("18")
                                provincial.setText("Cauquenes")
                            }
                            if (position == 22 || position == 23 || position == 24 || position == 25 || position == 26 || position == 27 || position == 28 || position == 29) {
                                distrito.setText("18")
                                provincial.setText("Linares")
                            }

                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }
                    }

                }
                if(position == 9){
                    val nuble: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.nuble, android.R.layout.simple_spinner_item)
                    spin2.adapter = nuble

                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long
                        ) {
                            if (position == 0 || position == 1 || position == 2 || position == 3 || position == 4 || position == 5 || position == 6 || position == 7 || position == 8) {
                                distrito.setText("19")
                                provincial.setText("Diguillin")
                            }

                            if (position == 9 || position == 10 || position == 11 || position == 12 || position == 13 || position == 14 || position == 15) {
                                distrito.setText("19")
                                provincial.setText("Itata")
                            }
                            if (position == 16 || position == 17 || position == 18 || position == 19 || position == 20) {
                                distrito.setText("19")
                                provincial.setText("Punilla")
                            }

                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }
                    }

                }
                if(position == 10){
                    val bio: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.biobio, android.R.layout.simple_spinner_item)
                    spin2.adapter = bio

                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long
                        ) {
                            if (position == 0 || position == 1 || position == 2 || position == 3) {
                                distrito.setText("20")
                                provincial.setText("Concepcion I")
                            }

                            if (position == 4 || position == 5 || position == 6) {
                                distrito.setText("20")
                                provincial.setText("Conceptocion II")
                            }
                            if (position == 7 || position == 8 || position == 9 || position == 10) {
                                distrito.setText("20")
                                provincial.setText("Conceptocion III")
                            }
                            if (position == 11 || position == 12 || position == 13 || position == 14 || position == 15 || position == 16) {
                                distrito.setText("21")
                                provincial.setText("Arauco")
                            }
                            if (position == 18 || position == 19 || position == 20 || position == 21 || position == 22 || position == 23 || position == 24 || position == 25 || position == 26 || position == 27 || position == 28 || position == 29 || position == 30 || position == 31) {
                                distrito.setText("21")
                                provincial.setText("Biobio")
                            }
                            if (position == 32) {
                                distrito.setText("21")
                                provincial.setText("Conceptocion III")
                            }

                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }
                    }

                }
                if(position == 11){
                    val arauco: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.araucania, android.R.layout.simple_spinner_item)
                    spin2.adapter = arauco

                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long
                        ) {
                            if (position == 0 || position == 1 || position == 2 || position == 3 || position == 4) {
                                distrito.setText("22")
                                provincial.setText("Cautin II")
                            }

                            if (position == 5 || position == 6 || position == 7 || position == 8 || position == 9 || position == 10 || position == 11 || position == 12 || position == 13 || position == 14 || position == 15) {
                                distrito.setText("22")
                                provincial.setText("Malleco")
                            }
                            if (position == 16 || position == 17) {
                                distrito.setText("23")
                                provincial.setText("Cautin I")
                            }
                            if (position == 18 || position == 19 || position == 20 || position == 21 || position == 22 || position == 23 || position == 24 || position == 25 || position == 26 || position == 27 || position == 28 || position == 29 || position == 30 || position == 31) {
                                distrito.setText("23")
                                provincial.setText("Cautin II")
                            }
                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }
                    }

                }
                if(position == 12){
                    val rios: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.rios, android.R.layout.simple_spinner_item)
                    spin2.adapter = rios

                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long
                        ) {
                            if (position == 0 || position == 1 || position == 2 || position == 3) {
                                distrito.setText("24")
                                provincial.setText("Ranco")
                            }

                            if (position == 3 || position == 4 || position == 5 || position == 6 || position == 7 || position == 8 || position == 9 || position == 10 || position == 11) {
                                distrito.setText("24")
                                provincial.setText("Valdivia")
                            }

                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }
                    }


                }
                if(position == 13){
                    val lagos: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.lagos, android.R.layout.simple_spinner_item)
                    spin2.adapter = lagos

                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long
                        ) {
                            if (position == 0 || position == 1 || position == 2 || position == 3 || position == 4) {
                                distrito.setText("25")
                                provincial.setText("Llanquihue")
                            }

                            if (position == 5 || position == 6 || position == 7 || position == 8 || position == 9 || position == 10 || position == 11) {
                                distrito.setText("25")
                                provincial.setText("Osorno")
                            }
                            if (position == 12 || position == 13 || position == 14 || position == 15 || position == 16 || position == 17 || position == 18 || position == 19 || position == 20 || position == 21) {
                                distrito.setText("26")
                                provincial.setText("Chiloe")
                            }
                            if (position == 22 || position == 23 || position == 24 || position == 25) {
                                distrito.setText("26")
                                provincial.setText("Llanquihue")
                            }
                            if (position == 26 || position == 27 || position == 28 || position == 29) {
                                distrito.setText("26")
                                provincial.setText("Palena")
                            }

                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }
                    }

                }
                if(position == 14){
                    val aisen: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.aisen, android.R.layout.simple_spinner_item)
                    spin2.adapter = aisen

                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long
                        ) {
                            if (position == 0 || position == 1 || position == 2) {
                                distrito.setText("27")
                                provincial.setText("Aisen")
                            }

                            if (position == 3 || position == 4 || position == 5) {
                                distrito.setText("27")
                                provincial.setText("Capitan Prat")
                            }
                            if (position == 6 || position == 7) {
                                distrito.setText("27")
                                provincial.setText("Coyhaique")
                            }
                            if (position == 8 || position == 9) {
                                distrito.setText("27")
                                provincial.setText("General Cabrera")
                            }

                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }
                    }
                }
                if(position == 15){
                    val maga: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.magallanes, android.R.layout.simple_spinner_item)
                    spin2.adapter = maga

                    spin2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(
                            parent: AdapterView<*>?,
                            view: View?,
                            position: Int,
                            id: Long
                        ) {
                            if (position == 0 || position == 1) {
                                distrito.setText("28")
                                provincial.setText("Antartica Chilena")
                            }

                            if (position == 2 || position == 3 || position == 4 || position == 5) {
                                distrito.setText("28")
                                provincial.setText("Magallanes")
                            }
                            if (position == 6 || position == 7 || position == 8) {
                                distrito.setText("28")
                                provincial.setText("Tierra del Fuego")
                            }
                            if (position == 9 || position == 10) {
                                distrito.setText("28")
                                provincial.setText("Ultima Esperanza")
                            }

                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }
                    }

                }
                if(position == 16){
                    val extra: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(applicationContext, R.array.extra, android.R.layout.simple_spinner_item)
                    spin2.adapter = extra
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        //******** Termina configuracion spinner 2, comunas **********


        acept.setOnClickListener{
            if(check.isChecked)  {

                    if (nombre.text.isNotEmpty() && edad.text.isNotEmpty()){

                        if (pass.text.toString() == pass2.text.toString()) {

                            if (pass.length() >= 6){

                            FirebaseAuth.getInstance()
                                .createUserWithEmailAndPassword(email.text.toString(),
                                    pass.text.toString()).addOnCompleteListener {

                                    if (it.isSuccessful) {
                                        db.collection("user").document(email.text.toString()).set(
                                            hashMapOf("nombre" to nombre.text.toString(),
                                                "apellidos" to apellidos.text.toString(),
                                                "edad" to edad.text.toString(),
                                                "genero" to genero.selectedItem.toString(),
                                                "region" to spin1.selectedItem.toString(),
                                                "comuna" to spin2.selectedItem.toString(),
                                                "distrito" to distrito.text.toString(),
                                                "circuncripcion" to provincial.text.toString(),
                                                "condiciones" to check.isChecked.toString()))

                                        var gointent = Intent(this, pregunta1Activity::class.java)
                                        gointent.putExtra("email", email.text.toString())
                                        startActivity(gointent)

                                    } else {
                                        showError3()
                                    }
                                }
                        }else {
                            showcaracter()
                            }
                        }else{
                            showError4()
                        }


                    } else{
                    showError2()
                    }
            }else{
                showError()
            }
        }

        logOut.setOnClickListener{
            FirebaseAuth.getInstance().signOut()
            onBackPressed()
        }


    }



    private fun showError(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error de aprobación")
        builder.setMessage("No ha aceptado los terminos y condiciones")
        builder.setPositiveButton("Aceptar", null)
        val dialog = builder.create()
        dialog.show()
    }

    private fun showError2(){
        val builder2 = AlertDialog.Builder(this)
        builder2.setTitle("Error de datos")
        builder2.setMessage("Faltan datos para el registro")
        builder2.setPositiveButton("Aceptar", null)
        val dialog2 = builder2.create()
        dialog2.show()
    }

    private fun showError3(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error de datos")
        builder.setMessage("Problemas con el registro en la base de datos")
        builder.setPositiveButton("Aceptar", null)
        val dialog = builder.create()
        dialog.show()
    }

    private fun showError4(){
    val builder = AlertDialog.Builder(this)
    builder.setTitle("Error de datos")
    builder.setMessage("la Contraseña no es igual")
    builder.setPositiveButton("Aceptar", null)
    val dialog = builder.create()
    dialog.show()
    }


    private fun showcaracter(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error de datos")
        builder.setMessage("la Contraseña es muy corta")
        builder.setPositiveButton("Aceptar", null)
        val dialog = builder.create()
        dialog.show()
    }
}