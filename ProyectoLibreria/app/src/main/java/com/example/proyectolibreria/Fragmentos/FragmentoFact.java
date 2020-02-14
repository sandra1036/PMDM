package com.example.proyectolibreria.Fragmentos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.proyectolibreria.R;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentoFact.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentoFact#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentoFact extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";
    private static final String ARG_PARAM4 = "param4";
    private static final String ARG_PARAM5 = "param5";

    // TODO: Rename and change types of parameters
    private int mParam1;
    private String mParam2;
    private String mParam3;
    private String mParam4;
    private String mParam5;

    private OnFragmentInteractionListener mListener;

    public FragmentoFact() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Imagen Libro
     * @param param2 Titulo Libro.
     * @param param3 Precio Libro.
     * @param param4 Precio Por ser Fisico.
     * @param param5 Total.
     * @return A new instance of fragment FragmentoFact.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentoFact newInstance(int param1, String param2,String param3,String param4,String param5) {
        FragmentoFact fragment = new FragmentoFact();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putString(ARG_PARAM3,param3);
        args.putString(ARG_PARAM4,param4);
        args.putString(ARG_PARAM5,param5);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3=getArguments().getString(ARG_PARAM3);
            mParam4=getArguments().getString(ARG_PARAM4);
            mParam5=getArguments().getString(ARG_PARAM5);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_fragmento_fact, container, false);

        ImageView imageView=(ImageView)v.findViewById(R.id.imagen);
        imageView.setImageResource(mParam1);

        TextView titulo=(TextView)v.findViewById(R.id.LibroFact);
        titulo.setText("Titulo: "+String.valueOf(mParam2));

        TextView precio=(TextView)v.findViewById(R.id.Precio);
        precio.setText("Precio: "+String.valueOf(mParam3));

        TextView preciofis=(TextView)v.findViewById(R.id.PreFisico);
        preciofis.setText("Precio Fisico: "+String.valueOf(mParam4));

        TextView total=(TextView)v.findViewById(R.id.Total);
        total.setText("Total: "+String.valueOf(mParam5));

        return v;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
