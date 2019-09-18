package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HolaMundo2 extends AppCompatActivity {

    private EditText texto;
    private Button boton;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo2);

        Intent intent=getIntent();
        String message=intent.getExtras().getString("Texto");
        textView=findViewById(R.id.textView2);
        textView.setText(message);





    }
public void vol(View view){


    Intent intent2=new Intent();
    Bundle bundle2=new Bundle();
    String mensaje=textView.getText().toString();
    bundle2.putString("Texto",mensaje);
    intent2.putExtras(bundle2);
    setResult(Activity.RESULT_OK, intent2);
    finish();
}

}
