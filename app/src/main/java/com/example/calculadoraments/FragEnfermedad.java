package com.example.calculadoraments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class FragEnfermedad extends Fragment {
    //Inicializamos las variables que contendran los valores asignados a cada respuesta
    private int nETNQ = 0;
    private int nRETNQ = 0;
    private int nIE2S = 0;
    private int nIDC2S = 0;
    private int nIE6S = 0;
    private int nIDC6S = 0;
    private int totF2 = 0;

    // Creamos los radio groups y los botones seleccionados de cada sección
    RadioGroup rg1;
    //RadioButton rb1;
    RadioGroup rg2;
    //RadioButton rb2;
    RadioGroup rg3;
    //RadioButton rb3;
    RadioGroup rg4;
    //RadioButton rb4;
    RadioGroup rg5;
    //RadioButton rb5;
    RadioGroup rg6;
    //RadioButton rb6;
    TextView tot;
    public FragEnfermedad() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    public int getTotal(){return nETNQ+nRETNQ+nIE2S+nIDC2S+nIE6S+nIDC6S;}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag_enfermedad, container, false);
        rg1 = view.findViewById(R.id.RG_ETNQ);
        rg2 = view.findViewById(R.id.RG_RETNQ);
        rg3 = view.findViewById(R.id.RG_IE2SEM);
        rg4 = view.findViewById(R.id.RG_IDC2SEM);
        rg5= view.findViewById(R.id.RG_IE6SEM);
        rg6= view.findViewById(R.id.RG_IDC6SEM);
        tot = view.findViewById(R.id.TextTotalFg2);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
            //método para actualizar la respuesta seleccionada en el primer Radio Group e ir sumando sus respectivos puntos.
        {
            public void onCheckedChanged(RadioGroup group, int chekedId){

                switch (chekedId){
                    case R.id.rbETNQ1:
                        nETNQ = 1;
                        System.out.println(nETNQ);
                        break;
                    case R.id.rbETNQ2:
                        nETNQ = 2;
                        System.out.println(nETNQ);
                        break;
                    case R.id.rbETNQ3:
                        nETNQ = 3;
                        System.out.println(nETNQ);
                        break;
                    case R.id.rbETNQ4:
                        nETNQ = 4;
                        System.out.println(nETNQ);
                        break;
                    case R.id.rbETNQ5:
                        nETNQ = 5;
                        System.out.println(nETNQ);
                        break;

                }

            }
        });
        //ystem.out.println(nETNQ);
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
                //método para actualizar la respuesta seleccionada en el segundo Radio Group e ir sumando sus respectivos puntos.
        {
            public void onCheckedChanged(RadioGroup group, int chekedId){
                switch (chekedId){
                    case R.id.rbRETnQ1:
                        nRETNQ = 1;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbRETnQ2:
                        nRETNQ = 2;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbRETnQ3:
                        nRETNQ = 3;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbRETnQ4:
                        nRETNQ = 4;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbRETnQ5:
                        nRETNQ = 5;
                        //System.out.println(nETNQ);
                        break;
                }
            }
        });


        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
                //método para actualizar la respuesta seleccionada en el tercer Radio Group e ir sumando sus respectivos puntos.
        {
            public void onCheckedChanged(RadioGroup group, int chekedId){
                switch (chekedId){
                    case R.id.rbIE2Sem1:
                        nIE2S = 1;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIE2Sem2:
                        nIE2S = 2;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIE2Sem3:
                        nIE2S = 3;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIE2Sem4:
                        nIE2S = 4;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIE2Sem5:
                        nIE2S = 5;
                        //System.out.println(nETNQ);
                        break;
                }
            }
        });

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
                //método para actualizar la respuesta seleccionada en el cuarto Radio Group e ir sumando sus respectivos puntos.
        {
            public void onCheckedChanged(RadioGroup group, int chekedId){
                switch (chekedId){
                    case R.id.rbIDC2Sem1:
                        nIDC2S = 1;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIDC2Sem2:
                        nIDC2S = 2;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIDC2Sem3:
                        nIDC2S = 3;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIDC2Sem4:
                        nIDC2S = 4;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIDC2Sem5:
                        nIDC2S = 5;
                        //System.out.println(nETNQ);
                        break;
                }
            }
        });

        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
                //método para actualizar la respuesta seleccionada en el quinto Radio Group e ir sumando sus respectivos puntos.
        {
            public void onCheckedChanged(RadioGroup group, int chekedId){
                switch (chekedId){
                    case R.id.rbIE6Sem1:
                        nIE6S = 1;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIE6Sem2:
                        nIE6S = 2;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIE6Sem3:
                        nIE6S = 3;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIE6Sem4:
                        nIE6S = 4;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIE6Sem5:
                        nIE6S = 5;
                        //System.out.println(nETNQ);
                        break;
                }
            }
        });

        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
                //método para actualizar la respuesta seleccionada en el sexto Radio Group e ir sumando sus respectivos puntos.
        {
            public void onCheckedChanged(RadioGroup group, int chekedId){
                switch (chekedId){
                    case R.id.rbIDC6Sem1:
                        nIDC6S = 1;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIDC6Sem2:
                        nIDC6S = 2;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIDC6Sem3:
                        nIDC6S = 3;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIDC6Sem4:
                        nIDC6S = 4;
                        //System.out.println(nETNQ);
                        break;
                    case R.id.rbIDC6Sem5:
                        nIDC6S = 5;
                        //System.out.println(nETNQ);
                        break;
                }
            }
        });
        return view;
    }
}