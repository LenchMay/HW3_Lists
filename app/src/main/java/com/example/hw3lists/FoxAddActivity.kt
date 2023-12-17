package com.example.hw3lists

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hw3lists.databinding.ActivityFoxAddBinding

class FoxAddActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityFoxAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fox_add)

        binding.buttonSave.setOnClickListener {

            val fox = Fox(binding.ageEditText.text.toString(), binding.ageEditText.text.toString(), binding.colorEditColor.text.toString())
            val data = Intent().apply {
                putExtra("Fox", fox)
            }
            setResult(RESULT_OK, data)
            finish()
        }
    }
}