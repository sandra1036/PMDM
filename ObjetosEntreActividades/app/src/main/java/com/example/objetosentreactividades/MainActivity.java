package com.example.objetosentreactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editTextN=(EditText)findViewById(R.id.edittext);
        final EditText editTextA=(EditText)findViewById(R.id.edittext2);
        final EditText editTextE=(EditText)findViewById(R.id.edittext3);
        final ImageView imageView=(ImageView)findViewById(R.id.persona);
        Button button=(Button)findViewById(R.id.button);
        imageView.setImageResource(R.drawable.persona);//para que muestre la imagen

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre= editTextN.getText().toString();
                String apellido=editTextA.getText().toString();
                String edad=editTextE.getText().toString();

                if(TextUtils.isEmpty(edad)) edad="0";

                Persona p=new Persona(nombre,apellido,Integer.parseInt(edad));//R.drawable.imagen);

                Toast.makeText(MainActivity.this,p.toString(), Toast.LENGTH_LONG).show(); //Muestra los datos de la persona para saber que vaya

                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                Bundle bundle=new Bundle();
                bundle.putSerializable("CLAVEper", p);
                intent.putExtras(bundle);
                startActivity(intent);


            }
        });

    }

}
