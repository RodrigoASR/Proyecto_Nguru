package com.example.nguru_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.QueryDocumentSnapshot

class BaseDatosC : AppCompatActivity() {


    private val db = FirebaseFirestore.getInstance()


    val adapter = CandidatoAdapter(FirestoreRecyclerOptions.Builder<Candidatos>()
            .setQuery(db.collection("constituyentes"), Candidatos::class.java).build(), this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base_datos_c)

        val recycler = findViewById<RecyclerView>(R.id.recyclerCandidatos)
        recycler.layoutManager = LinearLayoutManager(this)


        adapter.notifyDataSetChanged()
        recycler.setAdapter(adapter)

    }

    override fun onStart() {
        super.onStart()
        adapter.startListening()
    }

    override fun onStop() {
        super.onStop()
        adapter.stopListening()
    }

}

