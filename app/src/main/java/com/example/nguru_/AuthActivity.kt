package com.example.nguru_


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class AuthActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)



        setup()
    }

    private fun setup() {
        title = "            Encuesta de postura política"

        val signUp = findViewById<View>(R.id.singUpButton) as Button
        val login = findViewById<View>(R.id.loginButton) as Button
        val email = findViewById<View>(R.id.emailEditText) as EditText
        val pass = findViewById<View>(R.id.passwordEditText) as EditText



        signUp.setOnClickListener{
            if (email.text.isNotEmpty() && pass.text.isNotEmpty()){
                FirebaseAuth.getInstance().signInWithEmailAndPassword(email.text.toString(),pass.text.toString()).addOnCompleteListener {
                    if(it.isSuccessful){
                        val intent = Intent(this,EleccionesUsers::class.java)
                        intent.putExtra("email", email.text.toString())
                        startActivity(intent)
                    }else{
                        showError2()
                    }
                }
            }
        }


        login.setOnClickListener {

            var registrobtn = Intent(this, HomeActivity::class.java)
            startActivity(registrobtn)
        }

    }



    private fun showError2(){
        val builder3 = AlertDialog.Builder(this)
        builder3.setTitle("Error")
        builder3.setMessage("Error en el proceso de autenticación")
        builder3.setPositiveButton("Aceptar", null)
        val dialog = builder3.create()
        dialog.show()
    }


}