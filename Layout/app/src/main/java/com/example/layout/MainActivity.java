package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickButtonLineal(View view){
        Intent intent=new Intent(MainActivity.this,LayoutLineal.class);
        Bundle bundle=new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);

    }
    public void onClickButtonTable(View view){
        Intent intent=new Intent(MainActivity.this,TableLayout.class);
        Bundle bundle=new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void onClickButtonRelative(View view){
        Intent intent=new Intent(MainActivity.this,RealtiveLayout.class);
        Bundle bundle=new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);
    }
    public void onClickGrid(View view){
        Intent intent=new Intent(MainActivity.this,Grid.class);
        Bundle bundle=new Bundle();
        intent.putExtras(bundle);
        startActivity(intent);

    }

}
