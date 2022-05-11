package br.com.myapplication;


import static android.content.ContentValues.TAG;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

import br.com.myapplication.api.DataService;
import br.com.myapplication.api.dto.Object;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Button botaoRecuperar;
    private TextView textoResultado;
    private Retrofit retrofit;
    private List<Object> listaObjeto = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoRecuperar = findViewById(R.id.buttonRecuperar);
        textoResultado = findViewById(R.id.textResultado);

        retrofit = new Retrofit.Builder()
                .baseUrl("http://sportsmatch.com.br/teste/")
                .addConverterFactory(GsonConverterFactory.create())
                .callbackExecutor(Executors.newSingleThreadExecutor())
                .build();

        DataService objectApi = retrofit.create(DataService.class);
        Call<List<Object>> call = objectApi.getPlayer();

        call.enqueue(new Callback<List<Object>>() {
            @Override
            public void onResponse(Call<List<Object>> call, Response<List<Object>> response) {
                if (response.isSuccessful()){
                    listaObjeto = response.body();
                    Log.i("resposta", String.valueOf(listaObjeto.size()));
                }

            }

            @Override
            public void onFailure(Call<List<Object>> call, Throwable t) {
                Log.i("resposta", "deu ruim");
            }
        });

    }
}
