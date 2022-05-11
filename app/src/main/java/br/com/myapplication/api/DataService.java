package br.com.myapplication.api;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import br.com.myapplication.api.dto.Object;
import retrofit2.Call;
import retrofit2.http.GET;


public interface DataService {


    @GET("teste.json")
    Call<List<Object>> getPlayer();
}
