package com.example.examennoviembresolucion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static ImageView imageViewPatinete, imageViewBicicleta, imageViewCoche;
    public static ImageView imageresul;
    private Button btn;


    public static MedioTransporte[] electricos = new MedioTransporte[]{
            new MedioTransporte("skate", "Roxi", "12", R.drawable.skate),
            new MedioTransporte("patinete", "Roxi", "15", R.drawable.patinete),
            new MedioTransporte("monociclo", "Oneil", "18", R.drawable.monociclo1)};

    public static MedioTransporte[] bicis = new MedioTransporte[]{
            new MedioTransporte("Paseo", "Orbea", "15", R.drawable.bici1),
            new MedioTransporte("Ciudad", "Cube", "20", R.drawable.bici2),
            new MedioTransporte("Montaña", "Bike", "25", R.drawable.bici3)};

    public static MedioTransporte[] coches = new MedioTransporte[]{
            new MedioTransporte("Megane", "Renault", "60", R.drawable.megan1),
            new MedioTransporte("Leon", "Seat", "70", R.drawable.leon3),
            new MedioTransporte("Fiesta", "Ford", "75", R.drawable.fiesta2)};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewPatinete = (ImageView) findViewById(R.id.img_11);
        imageViewBicicleta = (ImageView) findViewById(R.id.img_12);
        imageViewCoche = (ImageView) findViewById(R.id.img_13);
        imageresul = (ImageView) findViewById(R.id.imgResul);
        btn = (Button) findViewById(R.id.btn);


        imageViewPatinete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ha entrado en el onclick ", Toast.LENGTH_SHORT).show();
                imageresul.setImageResource(R.drawable.patinete);


            }
        });

        imageViewBicicleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ha entrado", Toast.LENGTH_SHORT).show();
                imageresul.setImageResource(R.drawable.bicis);
            }
        });


        imageViewCoche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ha entrado Coche", Toast.LENGTH_SHORT).show();
                imageresul.setImageResource(R.drawable.coches);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                Bundle bundle = new Bundle("");
                intent.getSerializableExtra("clave");
                startActivity(intent);


            }
        });

    }
}