package com.example.proyectolibreria.Activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.proyectolibreria.R;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private EditText editusuario,editpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editusuario=(EditText)findViewById(R.id.entryusuario);
        editpassword=(EditText)findViewById(R.id.entrypassword);

        Button button=(Button)findViewById(R.id.buttonCambiar);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Principal.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("clave",Principal.libros);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });


    }




    //Menu
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

}
