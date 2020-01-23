package com.example.proyectolibreria.Fragmentos;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.proyectolibreria.R;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentMenuLibro.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentMenuLibro#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentMenuLibro extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_menu_libro, container, false);
    }

}
