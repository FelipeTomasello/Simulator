package com.example.simulator.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.simulator.data.MatchesApi
import com.example.simulator.databinding.ActivityMainBinding
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {


    private lateinit var matchesApi: MatchesApi
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setupHttpClient()
        setupMachesList()
        setupMachesRefresh()
        setupFloatingButton()
    }

    private fun setupHttpClient() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://felipetomasello.github.io/match-simulator-api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        matchesApi = retrofit.create(MatchesApi.class)
    }

    private fun setupFloatingButton() {
        TODO("evento clic e simular partidas")
    }

    private fun setupMachesRefresh() {
        TODO("Atualizar partidas")
    }

    private fun setupMachesList() {
        matchesApi.getMatches()
    }
}

