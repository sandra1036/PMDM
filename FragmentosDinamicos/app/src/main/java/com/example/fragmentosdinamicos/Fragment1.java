package com.example.fragmentosdinamicos;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment1.InstantiationException} interface
 * to handle interaction events.
 * Use the {@link Fragment1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment1 extends Fragment {
    int mNum;
    static Fragment1 newInstance(int number) {
        Fragment1 f = new Fragment1();
        // Mantenemos el nÃºmero para usarlo en cualquier momento.
        Bundle args = new Bundle();
        args.putInt("num", number);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // obtenemos el nÃºmero que se habia pasado como argumento en
        // la creaciÃ³n de la instancia
        mNum = getArguments().getInt("num");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v  = null;
        if (mNum % 2 == 0){
            v = inflater.inflate(R.layout.fragment_fragment1, container, false);
            View tv = v.findViewById(R.id.text);
        }
        else{
            v = inflater.inflate(R.layout.fragment_fragment2 , container, false);
            View tv = v.findViewById(R.id.text2);
        }


        ((TextView)tv).setText("Fragmento nÃºmero #" + mNum);
        return v;
    }
}


