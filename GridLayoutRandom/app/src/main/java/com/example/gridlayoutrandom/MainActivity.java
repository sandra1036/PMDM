package com.example.gridlayoutrandom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private int [] imageid={R.id.image1,R.id.image2,R.id.image3,R.id.image4,R.id.image4,
            R.id.image5,R.id.image6,R.id.image7,R.id.image8,R.id.image9};
    private List<ImageView> ={R.drawable.cochedosrueda,R.drawable.aeronave,R.drawable.bicicleta,
    R.drawable.doscanoas,R.drawable.moto,R.drawable.patinete,R.drawable.tren1,R.drawable.phaeton,R.drawable.submarino};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
