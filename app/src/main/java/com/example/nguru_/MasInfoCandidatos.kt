package com.example.nguru_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.firebase.firestore.FirebaseFirestore

class MasInfoCandidatos : AppCompatActivity() {

    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mas_info_candidatos)



        setup()
    }

    private fun setup(){
        val infoId = intent.extras
        val id = infoId ?.getString("id")

        val nombreCan = findViewById<TextView>(R.id.textCandidato)
        val distrito = findViewById<TextView>(R.id.textDistrito)
        val partido = findViewById<TextView>(R.id.textPartido)
        val comuna = findViewById<TextView>(R.id.textComuna)
        val social = findViewById<TextView>(R.id.textSocial)
        val economico = findViewById<TextView>(R.id.textEconomico)




        db.collection("constituyentes").document(id.toString()).get()
            .addOnSuccessListener{
                nombreCan.setText(it.get("nombre") as String?)
                distrito.setText(it.get("distrito") as String?)
                partido.setText(it.get("partido") as String?)

                var social1 = it.get("social") as Long?
                social.setText(social1.toString())

                var eco1 = it.get("economico") as Long?
                economico.setText(eco1.toString())


                var valorx: Double = 0.0


                when(social1?.toInt()){
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

                when(eco1?.toInt()){
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
                val imagenX = findViewById<ImageView>(R.id.x)

                imagenX.translationX = valorx.toFloat()
                imagenX.translationY = valory.toFloat()


                comuna.setText(it.get("comuna") as String?)

            }






    }
}