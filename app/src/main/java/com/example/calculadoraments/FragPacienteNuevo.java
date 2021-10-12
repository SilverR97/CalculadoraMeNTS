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
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragPacienteNuevo#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragPacienteNuevo extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    Button BotonEnfermedad;
    public FragPacienteNuevo() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragPacienteNuevo.
     */
    // TODO: Rename and change types and number of parameters
    public static FragPacienteNuevo newInstance(String param1, String param2) {
        FragPacienteNuevo fragment = new FragPacienteNuevo();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     View view = inflater.inflate(R.layout.fragment_frag_paciente_nuevo, container, false);
        BotonEnfermedad = view.findViewById(R.id.btnSigEnf);
        BotonEnfermedad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BotonEnfermedad.setVisibility(View.GONE);


                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction= fragmentManager.beginTransaction();
                transaction.setReorderingAllowed(true);

                transaction.replace(R.id.fragPNuevo, new FragEnfermedad()).commit();
            }
        });



     return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}