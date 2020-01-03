package com.example.fragmentopersona;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {
    private Spinner spn;
    private View frag;
    private Persona[] persona = {
            new Persona("Eduardo", "Willson", "30", R.drawable.eduardo),
            new Persona("Daniela", "Kreimer", "40", R.drawable.danielakreimer),
            new Persona("Sara", "Cranell", "20", R.drawable.sara),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn = (Spinner) findViewById(R.id.spinner);
        AdaptadorPersona adaptadorPersona=new AdaptadorPersona(MainActivity.this);
        spn.setAdapter(adaptadorPersona);
        frag=(View)findViewById(R.id.frag);


        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String mensaje="";
                mensaje="Item clicked => "+ persona[position];



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public class AdaptadorPersona extends ArrayAdapter<Persona> {
        Activity context;

        public AdaptadorPersona(Activity context) {
            super(context, R.layout.desplegable, persona);
            this.context = context;
        }

        public View getDropDownView(int position, View view, ViewGroup viewGroup) {
            View viewDesplegada = getView(position, view, viewGroup);
            return viewDesplegada;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            LayoutInflater inflater = context.getLayoutInflater();
            View item = inflater.inflate(R.layout.desplegable, null);

            TextView textnombre = (TextView) item.findViewById(R.id.nombre);
            textnombre.setText(persona[i].getNombre());

            TextView textApellido = (TextView) item.findViewById(R.id.apellidos);
            textApellido.setText(persona[i].getApellido());

            TextView textEdad=(TextView)item.findViewById(R.id.edad);
            textEdad.setText(persona[i].getEdad());

            ImageView imageView=(ImageView)item.findViewById(R.id.foto);
            imageView.setImageResource(persona[i].getFoto());

            return item;
        }


    }
}
