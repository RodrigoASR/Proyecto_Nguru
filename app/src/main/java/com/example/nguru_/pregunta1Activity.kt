package com.example.nguru_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.google.firebase.firestore.FirebaseFirestore

class pregunta1Activity : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta1)

        setup()
    }
    private fun setup(){
        title = "Encuesta tendencias políticas"

        var email = findViewById<TextView>(R.id.nameCandidate)
        val bundle = intent.extras
        var email2 = bundle?.getString("email")
        email.setText(email2)

        val respuesta1 = findViewById<Spinner>(R.id.alternativasSpinner1)
        val respuesta2 = findViewById<Spinner>(R.id.alternativasSpinner2)
        val respuesta3 = findViewById<Spinner>(R.id.alternativasSpinner3)
        val respuesta4 = findViewById<Spinner>(R.id.alternativasSpinner4)
        val respuesta5 = findViewById<Spinner>(R.id.alternativasSpinner5)
        val respuesta6 = findViewById<Spinner>(R.id.alternativasSpinner6)
        val respuesta7 = findViewById<Spinner>(R.id.alternativasSpinner7)
        val respuesta8 = findViewById<Spinner>(R.id.alternativasSpinner8)
        val respuesta9 = findViewById<Spinner>(R.id.alternativasSpinner9)
        val respuesta10 = findViewById<Spinner>(R.id.alternativasSpinner10)

        val siguiente = findViewById<Button>(R.id.siguiente1Button)

        var valor1 = 0
        var valor2 = 0
        var valor3 = 0
        var valor4 = 0
        var valor5 = 0
        var valor6 = 0
        var valor7 = 0
        var valor8 = 0
        var valor9 = 0
        var valor10 = 0

        val resp1: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.alternativas,android.R.layout.simple_spinner_item)
        respuesta1.adapter = resp1

        val resp2: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.alternativas,android.R.layout.simple_spinner_item)
        respuesta2.adapter = resp2

        val resp3: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.alternativas,android.R.layout.simple_spinner_item)
        respuesta3.adapter = resp3

        val resp4: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.alternativas,android.R.layout.simple_spinner_item)
        respuesta4.adapter = resp4

        val resp5: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.alternativas,android.R.layout.simple_spinner_item)
        respuesta5.adapter = resp5

        val resp6: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.alternativas,android.R.layout.simple_spinner_item)
        respuesta6.adapter = resp6

        val resp7: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.alternativas,android.R.layout.simple_spinner_item)
        respuesta7.adapter = resp7

        val resp8: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.alternativas,android.R.layout.simple_spinner_item)
        respuesta8.adapter = resp8

        val resp9: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.alternativas,android.R.layout.simple_spinner_item)
        respuesta9.adapter = resp9

        val resp10: ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(
            this, R.array.alternativas,android.R.layout.simple_spinner_item)
        respuesta10.adapter = resp10

        respuesta1.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long,
            ) {
                if (position == 1) {
                    valor1 = 0
                }
                if (position == 2) {
                    valor1 = 1
                }
                if (position == 3) {
                    valor1 = 2
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        respuesta2.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long,
            ) {
                if (position == 1) {
                    valor2 = 0
                }
                if (position == 2) {
                    valor2 = 1
                }
                if (position == 3) {
                    valor2 = 2
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        respuesta3.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long,
            ) {
                if (position == 1) {
                    valor3 = 0
                }
                if (position == 2) {
                    valor3 = 1
                }
                if (position == 3) {
                    valor3 = 2
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        respuesta4.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long,
            ) {
                if (position == 1) {
                    valor4 = 0
                }
                if (position == 2) {
                    valor4 = 1
                }
                if (position == 3) {
                    valor4 = 2
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        respuesta5.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long,
            ) {
                if (position == 1) {
                    valor5 = 0
                }
                if (position == 2) {
                    valor5 = 1
                }
                if (position == 3) {
                    valor5 = 2
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        respuesta6.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long,
            ) {
                if (position == 1) {
                    valor6 = 0
                }
                if (position == 2) {
                    valor6 = 1
                }
                if (position == 3) {
                    valor6 = 2
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        respuesta7.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long,
            ) {
                if (position == 1) {
                    valor7 = 0
                }
                if (position == 2) {
                    valor7 = 1
                }
                if (position == 3) {
                    valor7 = 2
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        respuesta8.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long,
            ) {
                if (position == 1) {
                    valor8 = 0
                }
                if (position == 2) {
                    valor8 = 1
                }
                if (position == 3) {
                    valor8 = 2
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }


        respuesta9.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long,
            ) {
                if (position == 1) {
                    valor9 = 0
                }
                if (position == 2) {
                    valor9 = 1
                }
                if (position == 3) {
                    valor9 = 2
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }

        respuesta10.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long,
            ) {
                if (position == 1) {
                    valor10 = 0
                }
                if (position == 2) {
                    valor10 = 1
                }
                if (position == 3) {
                    valor10 = 2
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
            }
        }



        siguiente.setOnClickListener{

            var resp1 = respuesta1.selectedItem.toString()
            var resp2 = respuesta2.selectedItem.toString()
            var resp3 = respuesta3.selectedItem.toString()
            var resp4 = respuesta4.selectedItem.toString()
            var resp5 = respuesta5.selectedItem.toString()
            var resp6 = respuesta6.selectedItem.toString()
            var resp7 = respuesta7.selectedItem.toString()
            var resp8 = respuesta8.selectedItem.toString()
            var resp9 = respuesta9.selectedItem.toString()
            var resp10 = respuesta10.selectedItem.toString()

            val item =  "Selecciona aquí una alternativa"

            if (resp1 != item && resp2 != item && resp3 != item && resp4 != item
                && resp5 != item && resp6 != item && resp7 != item && resp8 != item
                && resp9 != item && resp10 != item ){


                var result1 = valor1 + valor2 + valor3 + valor4 + valor5 + valor6 + valor7 + valor8 + valor9 + valor10

                var total1 = result1*100/20

                db.collection("user").document(email.text.toString()).update(
                    hashMapOf("respuesta1" to valor1, "respuesta2" to valor2, "respuesta3" to valor3, "respuesta4" to valor4, "respuesta5" to valor5
                        , "respuesta6" to valor6, "respuesta7" to valor7, "respuesta8" to valor8, "respuesta9" to valor9, "respuesta10" to valor10,
                        "social" to total1) as Map<String, Any>)


                var sigue3 = Intent(this, pregunta2Activity::class.java)
                sigue3.putExtra("email", email.text.toString())
                sigue3.putExtra("resultado1", total1.toString())
                sigue3.putExtra("valorPag1", total1)
                startActivity(sigue3)

            } else {
                showError()
            }

        }

    }

    private fun showError(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Error de selección")
        builder.setMessage("una o más preguntas no se han respondido")
        builder.setPositiveButton("Aceptar", null)
        val dialog = builder.create()
        dialog.show()
    }
}