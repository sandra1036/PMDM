package com.example.examenrecopilatorio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private double por;
    public double precio;
    public TextView textPre;
    public EditText editText = (EditText) findViewById(R.id.entry);
    public static Destino destinos[] = new Destino[]{
            new Destino("ZonaA", "Europa", "10"),
            new Destino("ZonaB", "Ameria", "30"),
            new Destino("ZonaC", "Asia", "20")
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner spn = (Spinner) findViewById(R.id.szona);
        CheckBox ch = (CheckBox) findViewById(R.id.checkboxregalo);
        CheckBox ch2 = (CheckBox) findViewById(R.id.checkboxtarjeta);
        RadioGroup rg = (RadioGroup) findViewById(R.id.grup);
        TextView textZ = (TextView) findViewById(R.id.zonaS);
        TextView textC = (TextView) findViewById(R.id.continente);
        textPre = (TextView) findViewById(R.id.precio);
        precio = Integer.parseInt(textPre.getText().toString());
        final Button btn=(Button)findViewById(R.id.calcular);
        double pesok=Double.parseDouble(editText.getText().toString());
        rg.clearCheck();


        AdaptadorZona az = new AdaptadorZona(MainActivity.this);
        spn.setAdapter(az);






        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView arg0, View arg1, int position, long id) {
                String mensaje = "";
                mensaje = "Item clicked=> " + destinos[position].toString();
                Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_SHORT).show();


            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {


                if (group.getCheckedRadioButtonId() == R.id.tarifanormal) {


                }
                if (group.getCheckedRadioButtonId() == R.id.tarifaurgente) {
                    por = 0.3;
                    double cost=precio*por;
                }


            }
        });

        peso(pesok);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,PantallaEnvio.class);
                Bundle bundle=new Bundle();
                bundle.putSerializable("clave",destinos);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

    public static double peso(double peso) {
        double cost;
        if (peso <= 5) {
            cost = 1;
        } else if (peso > 5 && peso <= 10) {
            cost = 1.5;

        } else {
            cost = 2;
        }
        return cost;
    }
}



