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
            int anchura=getWidth();
            int altura=getHeight();
            Paint paint=new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.BLACK);
            canvas.drawRect(0,0,anchura,altura,paint);


            paint.setColor(Color.MAGENTA);
            paint.setStrokeWidth(20);
            paint.setStyle(Paint.Style.STROKE);

            String mensaje ="("+anchura+","+altura+")";
            paint.setTextSize(40);
            canvas.drawCircle(540,792,400,paint);
            paint.setStrokeWidth(100);
            //canvas.drawText(mensaje,500,1000,paint);
            paint.setColor(Color.RED);
            canvas.drawRect(100,100,100,100,paint);
            paint.setStrokeWidth(100);

            paint.setColor(Color.BLUE);
            canvas.drawRect(anchura-100,100,anchura-100,100,paint);
            paint.setStrokeWidth(100);

            paint.setColor(Color.YELLOW);
            canvas.drawRect(anchura-100,anchura+200,anchura-100,anchura+200,paint);
            paint.setStrokeWidth(100);

            paint.setColor(Color.GREEN);
            canvas.drawRect(100,anchura+200,100,anchura+200,paint);
            paint.setStrokeWidth(100);

            paint.setColor(Color.BLUE);
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeWidth(15);
            canvas.drawRect(540,792,550,780,paint);




        }
    }
}
