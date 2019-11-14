package com.example.androidfragmentos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements MeuFragmentoRetorno{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MeuFragmento f = (MeuFragmento)
                getSupportFragmentManager().findFragmentById(R.id.meuFragmento);


        f.retorno = this;

    }

    public void enviarDadosParaFragmento(View v){

        EditText et = findViewById(R.id.etNome);

        MeuFragmento f = (MeuFragmento)
                getSupportFragmentManager().findFragmentById(R.id.meuFragmento);

        f.atualizarTexto(et.getText().toString());
    }

    @Override
    public void setValorRetorno(String s){

        TextView tv = findViewById(R.id.tvResultado);

        tv.setText(s);
    }

}
