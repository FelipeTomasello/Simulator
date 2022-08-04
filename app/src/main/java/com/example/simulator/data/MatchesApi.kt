package com.example.simulator.data

import retrofit2.http.GET
import retrofit2.Call
import com.example.simulator.domain.Match

public interface MatchesApi {

    @GET("matches.json")
    fun getMatches(): Call<List<Match>>
}