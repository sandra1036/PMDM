package com.example.factorialconhilo;

import androidx.appcompat.app.AppCompatActivity;

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
        MiThread thread = new MiThread(n);
        thread.start();
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
            SystemClock.sleep(100);
        }
        return res;
    }

    class MiThread extends Thread {
        private int n, res;

        public MiThread(int n) {
            this.n = n;
        }

        public void run() {
            res = factorial(n);
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    salida.append(res + "\n");
                }
            });
        }

    }
}