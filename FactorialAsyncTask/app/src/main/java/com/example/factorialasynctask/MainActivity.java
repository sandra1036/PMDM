package com.example.factorialasynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText entrada;
    public static TextView salida;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        entrada = (EditText) findViewById(R.id.num);
        salida = (TextView) findViewById(R.id.resul);
    }

    public void calcularOperacion(View view) {
        int n = Integer.parseInt(entrada.getText().toString());
        salida.append(n + "! = ");
        MiTarea tarea = new MiTarea();
        tarea.execute(n);
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
            SystemClock.sleep(100);
        }
        return res;
    }

    class MiTarea extends AsyncTask<Integer,Void,Integer> {

        @Override
        protected Integer doInBackground(Integer... n){
            return factorial(n[0]);
        }
        @Override
        protected void onPostExecute(Integer res){
            salida.append(res+"\n");
        }

    }
}