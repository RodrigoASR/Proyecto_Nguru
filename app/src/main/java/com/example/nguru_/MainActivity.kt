package com.example.nguru_

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import kotlin.concurrent.thread


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //tiempo de espera
        Thread.sleep(2000)

        //llamado al splashscreen
        setTheme(R.style.Theme_Nguru_)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //eventos google analytics
        val analytics:FirebaseAnalytics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString("message", "Integración Completa")
        analytics.logEvent("InitScreen", bundle)



        setup()
    }

    private fun setup(){
        title = "            Vota inteligente con Nguru"

        val encuesta = findViewById<Button>(R.id.encuestaButton)
        val eleccion = findViewById<Button>(R.id.eleccionesButton)
        val volun = findViewById<Button>(R.id.voluntariosButton)
        val face = findViewById<ImageButton>(R.id.faceButton)
        val insta = findViewById<ImageButton>(R.id.instaButton)
        val twitter = findViewById<ImageButton>(R.id.twitterButton)

        encuesta.setOnClickListener{
            val intent:Intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
        }

        eleccion.setOnClickListener{
            val goselec:Intent = Intent(this, EleccionesActivity::class.java)
            startActivity(goselec)
        }

        volun.setOnClickListener{
            val govolunt = Intent(this, AccesActivity::class.java)
            startActivity(govolunt)
        }

        face.setOnClickListener{
            val uri:Uri = Uri.parse("http://www.facebook.com")
            val goface: Intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(goface)
        }

        insta.setOnClickListener{
            val uri2:Uri = Uri.parse("http://www.instagram.com")
            val goinsta: Intent = Intent(Intent.ACTION_VIEW, uri2)
            startActivity(goinsta)
        }

        twitter.setOnClickListener{
            val uri3:Uri = Uri.parse("http://www.twitter.com")
            val gotw: Intent = Intent(Intent.ACTION_VIEW, uri3)
            startActivity(gotw)
        }

    }
}