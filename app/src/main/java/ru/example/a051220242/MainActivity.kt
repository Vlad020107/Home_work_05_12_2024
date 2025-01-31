package ru.example.a051220242

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import ru.example.a051220242.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(R.layout.activity_main)
        val img:ImageView = findViewById(R.id.Avatar)
        img.setImageResource(R.drawable.kapi)
//        val intent = Intent(this, )
        val status_spinner = resources.getStringArray(R.id.status_spinner)
        val spinner = findViewById<Spinner>(R.array.status)
        if (spinner != null){
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, status_spinner
            )
            spinner.adapter = adapter
        }

    }
}