package com.hafiz.latihanujikom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.hafiz.latihanujikom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        doLogin()
    }

    private fun doLogin() {
        binding.btnLogin.setOnClickListener {
            val inputText = binding.plainTextInput.text.toString()
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("nama", inputText)
            startActivity(intent)
            Toast.makeText(this, "Anda berhasil login", Toast.LENGTH_LONG).show()
        }
    }
}