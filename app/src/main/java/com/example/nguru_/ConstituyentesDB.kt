package com.example.nguru_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.SearchView
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.firestore.FirestoreRecyclerOptions
import com.google.firebase.firestore.FirebaseFirestore

class ConstituyentesDB() : AppCompatActivity() {



    val bundle = intent.extras
    val distrito = bundle?.getString("distrito")

    val db = FirebaseFirestore.getInstance()

    val adapter = ConstiAdapter(FirestoreRecyclerOptions.Builder<Constituyentes>()
        .setQuery(db.collection("constituyentes").whereEqualTo("distrito", distrito.toString()), Constituyentes::class.java).build(), this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constituyentes_d_b)

        val recycler = findViewById<RecyclerView>(R.id.rvConsti)
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