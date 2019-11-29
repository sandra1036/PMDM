package com.example.examennoviembresolucion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
public static Spinner spn;
private RadioGroup radioGroup;
private CheckBox checkBoxg, checkBoxgps, checkBoxextras;
private EditText editText;
private RadioButton radioButtonseguro, radioButtonconseguro;
private double textViewPre;
private Button buttonTotal;
private TextView textViewtotal;
private ImageView img;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        spn = (Spinner) findViewById(R.id.spinner);
        radioGroup = (RadioGroup) findViewById(R.id.grup);
        radioButtonseguro = (RadioButton) findViewById(R.id.seguro);
        radioButtonconseguro = (RadioButton) findViewById(R.id.conseguro);
        checkBoxg = (CheckBox) findViewById(R.id.checkguantes);
        checkBoxg = (CheckBox) findViewById(R.id.checkboxgps);
        checkBoxextras = (CheckBox) findViewById(R.id.checkboxextras);
        editText = (EditText) findViewById(R.id.entry);
        buttonTotal = (Button) findViewById(R.id.totalprecio);
        textViewtotal = (TextView) findViewById(R.id.numpre);


        AdaptadorTransporte adaptadorTransporte=new AdaptadorTransporte(this);
        spn.setAdapter(adaptadorTransporte);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



   //     MedioTransporte transporte[]=(MedioTransporte[])getIntent().getSerializableExtra("clave");

    //      int precio=Integer.parseInt(transporte.getPrecio());
//
//
//        //Reradio(precio);
//        ReCheckBox(precio);
//        editText.getText();


//        buttonTotal.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//
//            textViewtotal.setText((int) textViewPre);
//            }
//
//        });

}
        public double ReCheckBox(int precio){

        if (checkBoxg.isClickable()) {
        return precio + 50;
        }

        if (checkBoxgps.isClickable()) {
        return precio + 50;
        }

        if (checkBoxextras.isClickable()) {
        return precio + 50;
        }

        return precio;

}
//
//public double Reradio(double precio) {
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//
//                if (group.getCheckedRadioButtonId() == R.id.conseguro) {
//
//                    precio *= 0.2;
//
//                }
//            }
//        });
//
//        return precio;
//}

public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menuitem, menu);
        return true;
        }

public boolean onOptionsItemSelected(MenuItem menuItem) {

        switch (menuItem.getItemId()) {
        case R.id.dibujo:
        Toast.makeText(getApplicationContext(), "Has pulsado Dibujo", Toast.LENGTH_SHORT).show();
        return true;

        case R.id.ayuda:

        Toast.makeText(getApplicationContext(), "Has pulsado Ayuda", Toast.LENGTH_SHORT).show();
        return true;

        case R.id.copy:
        Toast.makeText(getApplicationContext(), "Has pulsado Copy", Toast.LENGTH_SHORT).show();
        return true;

default:
        return super.onOptionsItemSelected(menuItem);


        }
    }
}