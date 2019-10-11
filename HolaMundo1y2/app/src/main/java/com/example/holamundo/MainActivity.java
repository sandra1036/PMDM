package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
      private  EditText Text;
      private  Button buttonC;
      private TextView Hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

   public void click(View view){
       Text= (EditText)findViewById(R.id.editText);
       buttonC= (Button)findViewById(R.id.button);
       Hello= (TextView)findViewById(R.id.textView);



       Intent intent=new Intent(MainActivity.this,HolaMundo2.class);
       Bundle bundle=new Bundle();
       String mensaje="Hola "+ Text.getText().toString();
       bundle.putString("Texto",mensaje);
       intent.putExtras(bundle);
       startActivityForResult(intent,1);

   }
   public void onActivityResult(int cod_resp, int cod_result,Intent intent) {



       if (cod_result== RESULT_OK) {
           Bundle otroBundle = intent.getExtras();
           Hello.setText(otroBundle.getString("Texto"));
       }

   }
}
