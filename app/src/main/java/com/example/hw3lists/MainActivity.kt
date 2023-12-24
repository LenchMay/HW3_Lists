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
    private lateinit var adapter: FoxAdapter
    private lateinit var foxDataSource: FoxDataSource

    private val addFoxActivityLauncher = registerForActivityResult(EditItemContract()) { result ->
        adapter.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAdd.setOnClickListener {
            addFoxActivityLauncher.launch(Unit)
        }

        foxDataSource = FoxDataSource()
        adapter = FoxAdapter()

        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter
    }

    private val userListener: FoxListener =
}