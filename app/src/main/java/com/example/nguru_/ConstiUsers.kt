package com.example.nguru_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ConstiUsers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consti_users)

        val bundle = intent.extras
        val id = bundle?.getString("id")
    }
}