package com.example.ejercico1dibujo;

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
        setContentView(new Figuras(this));
    }

    public class Figuras extends View{
        public Figuras(Context context){
            super(context);
        }
        protected void onDraw(Canvas canvas){
            Paint paint=new Paint();
            paint.setColor(Color.BLACK);
            paint.setStrokeWidth(40);
            paint.setStyle(Paint.Style.STROKE);
            int anchura=getWidth();
            int altura=getHeight();
            String mensaje ="("+anchura+","+altura+")";
            paint.setTextSize(40);
            canvas.drawText(mensaje,500,1000,paint);
            canvas.drawCircle(500,500,80,paint);

        }
    }
}
