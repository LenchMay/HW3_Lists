package com.example.hw3lists

import android.app.Instrumentation.ActivityResult
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw3lists.databinding.ActivityMainBinding
import com.example.hw3lists.EditItemContract

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val foxAdapter =  FoxAdapter()

    private val contract = registerForActivityResult(EditItemContract()) {
        foxAdapter.addFox(it)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAdd.setOnClickListener {
            moveOnAddElementActivity()
        }

        binding.recyclerView.adapter = foxAdapter
    }

    private fun moveOnAddElementActivity() {
        contract.launch(Unit)
    }
}