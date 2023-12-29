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
            val intent = Intent()
            intent.putExtra(EXTRA_NAME, binding.nameEditText.text.toString())
            intent.putExtra(EXTRA_AGE, binding.ageEditText.text.toString())
            intent.putExtra(EXTRA_COLOR, binding.colorEditText.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }

    companion object {
        const val EXTRA_NAME = "name"
        const val EXTRA_AGE = "age"
        const val EXTRA_COLOR = "color"
    }
}