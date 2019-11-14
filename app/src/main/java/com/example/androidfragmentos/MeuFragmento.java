package com.example.androidfragmentos;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MeuFragmento extends Fragment {

    public MeuFragmentoRetorno retorno;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.meu_fragmento,
                container,
                false );
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button b = getView().findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText et = getView().findViewById(R.id.etNome);

                retorno.setValorRetorno(et.getText().toString());
            }
        });
    }

    public void atualizarTexto(String s){

        EditText tv = getView().findViewById(R.id.etNome);
        tv.setText(s);
    }


}
