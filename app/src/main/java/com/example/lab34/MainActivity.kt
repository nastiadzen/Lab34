package com.example.lab34

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lab34.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: ConstraintLayout = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        with(binding) {
            textName.setOnClickListener {
                textName.setTextColor(Color.RED)
            }

            textGroup.setOnClickListener {
                textGroup.setTextColor(Color.RED)
            }

            textCity.setOnClickListener {
                textCity.setTextColor(Color.RED)
            }

            buttonHide.setOnClickListener {
                textName.visibility = View.INVISIBLE
            }

            buttonShow.setOnClickListener {
                textName.visibility = View.VISIBLE
            }
        }
    }
}