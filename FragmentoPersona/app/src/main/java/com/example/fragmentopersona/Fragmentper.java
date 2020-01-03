package com.example.fragmentopersona;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragmentper.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragmentper#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmentper extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    private static final String ARG_PARAM4="param4";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String mParam3;
    private int mParam4;

    private OnFragmentInteractionListener mListener;

    public Fragmentper() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @param param3 Parameter 3.
     * @param param4 Parameter 4.
     *
     * @return A new instance of fragment Fragmentper.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragmentper newInstance(String param1, String param2,String param3,int param4) {
        Fragmentper fragment = new Fragmentper();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putString(ARG_PARAM3,param3);
        args.putInt(ARG_PARAM4,param4);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3= getArguments().getString(ARG_PARAM3);
            mParam4=getArguments().getInt(ARG_PARAM4);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_fragmentper, container, false);

        TextView textnombre=(TextView)v.findViewById(R.id.nombre);
        textnombre.setText("Nombre"+String.valueOf(mParam1));

        TextView textapellido=(TextView)v.findViewById(R.id.apellidos);
        textapellido.setText("Apellido"+String.valueOf(mParam2));

        TextView textEdad=(TextView)v.findViewById(R.id.edad);
        textEdad.setText("Edad"+String.valueOf(mParam3));

        ImageView foto=(ImageView)v.findViewById(R.id.foto);
        foto.setImageResource(mParam4);

        return v;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
