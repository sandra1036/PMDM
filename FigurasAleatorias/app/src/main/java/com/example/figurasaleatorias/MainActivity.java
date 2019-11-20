package com.example.figurasaleatorias;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void launchDrawShapes1(View clickedbutton){
        Intent intent=new Intent(MainActivity.this,DrawShapes1.class);
        startActivity(intent);
    }
    public void launchDrawShapes2(View clickedbutton){
        Intent intent=new Intent(MainActivity.this,DrawShapes2.class);
        startActivity(intent);
    }
}
