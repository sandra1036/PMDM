package com.example.figurasaleatorias;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {


        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void launchDrawShapes1(View clickedButton) {
            Intent activityIntent =
                    new Intent(this, DrawShapes1.class);
            startActivity(activityIntent);
        }

        public void launchDrawShapes2(View clickedButton) {
            Intent activityIntent =
                    new Intent(this, DrawShapes2.class);
            startActivity(activityIntent);
        }
    }




