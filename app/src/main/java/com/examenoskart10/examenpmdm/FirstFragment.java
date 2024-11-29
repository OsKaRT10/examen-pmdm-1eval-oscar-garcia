package com.examenoskart10.examenpmdm;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FirstFragment extends Fragment {
    TextView nombre;
    Button btn_uno, btn_dos, btn_tres;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        nombre = view.findViewById(R.id.nombre);
        btn_uno = view.findViewById(R.id.btn_uno);
        btn_dos = view.findViewById(R.id.btn_dos);
        btn_tres = view.findViewById(R.id.btn_tres);

        btn_uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText("Hola primer mundo");
            }
        });
        btn_dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText("Hola segundo mundo");
            }
        });
        btn_tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre.setText("Hola tercer mundo");
            }
        });

        return view;
    }
}