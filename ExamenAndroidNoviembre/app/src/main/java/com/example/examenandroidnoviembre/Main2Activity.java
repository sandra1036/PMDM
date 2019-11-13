package com.example.examenandroidnoviembre;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
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
        buttonTotal=(Button)findViewById(R.id.totalprecio);
        textViewtotal=(TextView)findViewById(R.id.numpre);

        //Se crea un Adaptador para objeto


        AdaptadorTransporteBici adaptadorTransporteBici = new AdaptadorTransporteBici(Main2Activity.this);
        spn.setAdapter(adaptadorTransporteBici);


        AdaptadorTransportePatinete adaptadorTransportePatinete = new AdaptadorTransportePatinete(Main2Activity.this);
        spn.setAdapter(adaptadorTransportePatinete);

        AdaptadorTransporteCoches adaptadorTransporteCoches = new AdaptadorTransporteCoches(Main2Activity.this);
        spn.setAdapter(adaptadorTransporteCoches);

        textViewPre=Double.parseDouble(String.valueOf(textViewPre));

        Reradio(textViewPre);
        ReCheckBox(textViewPre);
        editText.getText();


        buttonTotal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                textViewtotal.setText((int) textViewPre);
            }

        });
        
    }

    public double ReCheckBox(double precio){

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

    public double Reradio(final double precio) {
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (group.getCheckedRadioButtonId() == R.id.conseguro) {

                    textViewPre *=0.2;

                } else {
                    textViewPre=precio;
                }
            }
        });

        return precio;
    }

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