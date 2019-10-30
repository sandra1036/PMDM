package com.example.dibujo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Dibujo(this));
    }

  public class Dibujo extends View {
        public Dibujo(Context context){
            super(context);
        }
        protected void onDraw(Canvas canvas){
            Paint paint=new Paint();
            paint.setColor(Color.RED);
            paint.setStrokeWidth(40);//Esto es el borde
            paint.setStyle(Paint.Style.FILL);//Rellena el circulo del color
            //paint.setStyle(Paint.Style.STROKE);//Esto es el borde del circulo
            paint.setTextSize(50);
            canvas.drawCircle(700,500,120,paint);
            canvas.drawText("Mi circulo",600,700,paint);

        }
  }

}
