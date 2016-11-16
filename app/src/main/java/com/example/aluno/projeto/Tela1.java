package com.example.aluno.projeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        Button BtnEnviar = (Button) findViewById(R.id.BtnEnviar);
        BtnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText edittext = (EditText) findViewById(R.id.Menssagem);
                String texto = edittext.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("telinhas", texto);

                Intent intent = new Intent (Tela1.this,Tela2.class);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }
}
