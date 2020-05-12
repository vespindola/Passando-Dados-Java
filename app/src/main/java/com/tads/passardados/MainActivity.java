package com.tads.passardados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //vinicius espindola - 11/05/2020
    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                Usuario usuario = new Usuario("Vinicius Espindola", "vespindola@coamo.com.br");

                //passando dados
                intent.putExtra("nome", "Vinicius Espindola");
                intent.putExtra("idade", 21);
                intent.putExtra("objeto", usuario);

                //chamando a segunda activity
                startActivity(intent);
            }
        });
    }
}
