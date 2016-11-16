package com.example.aluno.projeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Intent caminhao = getIntent();

        Bundle pacote = caminhao.getExtras();

        String conteudo = pacote.getString("telinhas");

        Toast.makeText(getBaseContext(),conteudo, Toast.LENGTH_LONG).show();

    }
}
