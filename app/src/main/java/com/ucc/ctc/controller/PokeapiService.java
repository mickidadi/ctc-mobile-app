package com.ucc.ctc.controller;

import com.ucc.ctc.models.PokemonRequest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonRequest> obtainListPokemon(@Query("limit") int limit, @Query("offset") int offset);
}
