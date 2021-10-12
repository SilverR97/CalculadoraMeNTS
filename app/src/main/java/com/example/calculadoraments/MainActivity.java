package com.example.calculadoraments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
//public class MainActivity extends AppCompatActivity{
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageButton botonPacienteN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonPacienteN = findViewById(R.id.imgButton_PacienteNuevo);
        botonPacienteN.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        botonPacienteN.setVisibility(View.GONE);
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.MainCont, new FragPacienteNuevo()).commit();

    }
}