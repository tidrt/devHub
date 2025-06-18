package dev.tidrt.devhub.network.helper

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GitHubHelper {
    companion object{
        private const val BASE_URL = "https://api.github.com/"

        val retrofit : Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}