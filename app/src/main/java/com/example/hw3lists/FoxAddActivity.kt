package com.example.hw3lists

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw3lists.databinding.ActivityFoxAddBinding
import java.util.zip.Inflater

class FoxAddActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityFoxAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoxAddBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSave.setOnClickListener {

            val fox = Fox(name = binding.ageEditText.text.toString(), age = binding.ageEditText.text.toString(), color = binding.colorEditColor.text.toString())
            val data = Intent().apply {
                putExtra("Fox", fox)
            }
            setResult(RESULT_OK, data)
            finish()
        }
    }
}