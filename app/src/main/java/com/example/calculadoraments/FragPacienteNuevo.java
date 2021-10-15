package com.example.calculadoraments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;


public class FragPacienteNuevo extends Fragment {

    SeekBar barraEdad;
    Button BotonEnfermedad;
    TextView txtRangoEdad;

    int CalAp = 0;
    int CalSaos = 0;
    int CalPat = 0;
    int CalDiab = 0;
    int CalInmuno = 0;
    int CalGripa = 0;
    int CalCovid = 0;
    int CalEdad = 0;
    int totalFragPNuevo = 0;
    Spinner Ap;
    Spinner Saos;
    Spinner PatCard;
    Spinner Diab;
    Spinner Inmuno;
    Spinner Gripa;
    Spinner Covid;
    TextView tot;
    public FragPacienteNuevo() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
     View view = inflater.inflate(R.layout.fragment_frag_paciente_nuevo, container, false);
    //Inciamos spinners, definimos los mensajes que aparecen en pantalla y los valores que tienen.
     Ap = view.findViewById(R.id.AfPulmo);
     Saos = view.findViewById(R.id.SAOS);
     PatCard = view.findViewById(R.id.PatCardio);
     Diab = view.findViewById(R.id.Diabetes);
     Inmuno = view.findViewById(R.id.Inmuno);
     Gripa = view.findViewById(R.id.Gripa);
     Covid = view.findViewById(R.id.ContactoCovid);
     tot = view.findViewById(R.id.txtTotPNuevo);
     // texto que aparece como opciónes en los spinners
        String[] textAp ={"Ninguna","-","-","Mínima","Mayor a mínima"};
        String[] textSaos ={"No presenta","-","-","Moderado(no usa CPAP)","Utiliza CPAP"};
        String[] textPatCard ={"Ninguna","Mínima(no usa medicamentos)","Leve (1 medicamento)","Moderado (2 medicamentos)","Severo (3 medicamentos)"};
        String[] textDiab ={"Ninguna","-","Leve (no usa medicamento)","Moderado (medicamentos orales)","Mayor a moderado (Insulina)"};
        String[] textInmuno ={"No","" ,"","Moderado", "Severo"};
        String[] textGripa ={"Ninguno (Asintomático)","-","-","-","Sí"};
        String[] textCovid ={"No","Probablemente no","Posiblemente","Probablemente","Si"};
        //Poaibles tipos de valores que pueden tomar los spinners
        int [] Valoresa ={1,2,3,4,5};
        int [] Valoresb ={1,0,0,4,5};
        int [] Valoresc ={1,0,3,4,5};
        int [] Valoresd ={1,0,0,0,5};
        ArrayAdapter<String> adapterAp = new ArrayAdapter<>(view.getContext(), android.R.layout.simple_spinner_item,textAp);
        ArrayAdapter<String> adapterSaos = new ArrayAdapter<>(view.getContext(), android.R.layout.simple_spinner_item,textSaos);
        ArrayAdapter<String> adapterPatC = new ArrayAdapter<>(view.getContext(), android.R.layout.simple_spinner_item,textPatCard);
        ArrayAdapter<String> adapterDiab = new ArrayAdapter<>(view.getContext(), android.R.layout.simple_spinner_item,textDiab);
        ArrayAdapter<String> adapterInmuno = new ArrayAdapter<>(view.getContext(), android.R.layout.simple_spinner_item,textInmuno);
        ArrayAdapter<String> adapterGripa = new ArrayAdapter<>(view.getContext(), android.R.layout.simple_spinner_item,textGripa);
        ArrayAdapter<String> adapterCovid = new ArrayAdapter<>(view.getContext(), android.R.layout.simple_spinner_item,textCovid);
        Ap.setAdapter(adapterAp);
        Saos.setAdapter(adapterSaos);
        PatCard.setAdapter(adapterPatC);
        Diab.setAdapter(adapterDiab);
        Inmuno.setAdapter(adapterInmuno);
        Gripa.setAdapter(adapterGripa);
        Covid.setAdapter(adapterCovid);

        // Metodo para dar valor a la variable de Edad en su respectivos rangos.
        barraEdad =view.findViewById(R.id.seekBarEdad);
        txtRangoEdad = view.findViewById(R.id.textBRangoEdad);
        String [] rangos ={"","Menor de 21","21 - 40 ","41-50","51-65"," Mayor de 65"};
        barraEdad.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txtRangoEdad.setText(rangos[i]);
                CalEdad = i;
                //totalFragPNuevo = CalAp + CalSaos + CalPat + CalDiab+CalInmuno+CalGripa+CalCovid+CalEdad;
                //tot.setText("Total: "+totalFragPNuevo);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        // Métodos para dar el valor correspondiente a la opción seleccionada
        Ap.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                CalAp = Valoresb[i];
                //totalFragPNuevo = CalAp + CalSaos + CalPat + CalDiab+CalInmuno+CalGripa+CalCovid;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                CalAp = 0;
            }
        });
        Saos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                CalSaos = Valoresb[i];
                //totalFragPNuevo = CalAp + CalSaos + CalPat + CalDiab+CalInmuno+CalGripa+CalCovid;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                CalSaos =0;
            }
        });

        PatCard.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                CalPat = Valoresa[i];
                //totalFragPNuevo = CalAp + CalSaos + CalPat + CalDiab+CalInmuno+CalGripa+CalCovid;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                CalPat =0;
            }
        });

        Diab.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                CalDiab = Valoresc[i];
                //totalFragPNuevo = CalAp + CalSaos + CalPat + CalDiab+CalInmuno+CalGripa+CalCovid;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                CalDiab =0;
            }
        });

        Inmuno.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                CalInmuno = Valoresb[i];
                //totalFragPNuevo = CalAp + CalSaos + CalPat + CalDiab+CalInmuno+CalGripa+CalCovid;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                CalInmuno =0;
            }
        });
        Gripa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                CalGripa = Valoresd[i];
                //totalFragPNuevo = CalAp + CalSaos + CalPat + CalDiab+CalInmuno+CalGripa+CalCovid;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                CalGripa =0;
            }
        });
        Covid.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                CalCovid = Valoresa[i];
                totalFragPNuevo = CalAp + CalSaos + CalPat + CalDiab+CalInmuno+CalGripa+CalCovid+CalEdad;
                tot.setText("Total: "+totalFragPNuevo);
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                CalCovid =0;
            }

        });



        //Accion para pasar de fragmento Paciente nuevo a fragmento enfermedad
        BotonEnfermedad = view.findViewById(R.id.btnSigEnf);
        BotonEnfermedad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putInt("TotFrag1", totalFragPNuevo);
                Fragment fragment2 = new FragEnfermedad();
                BotonEnfermedad.setVisibility(View.GONE);

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction= fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);
                fragment2.setArguments(bundle);
                transaction.replace(R.id.fragPNuevo, fragment2).commit();

            }
        });



     return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}