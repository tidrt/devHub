package dev.tidrt.devhub.network

import dev.tidrt.devhub.network.model.GitHubProfileWeb
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {

    @GET(value = "/users/{user}")
    suspend fun findProfileBy(
        @Path("user") user : String
    ) : GitHubProfileWeb
}