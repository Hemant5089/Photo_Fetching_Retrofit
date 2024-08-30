package com.example.photofachingex;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PhotosApi {

    @GET("photos")
    Call<List<Model>> getApi();
}
