package com.example.fragmentobasico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {
    private View frag;
    private CheckBox ck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ck=(CheckBox)findViewById(R.id.aparece);
        frag=(View)findViewById(R.id.miFrg);

        ck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(ck.isChecked()){
                    frag.setVisibility(View.VISIBLE);
                }else{
                    frag.setVisibility(View.INVISIBLE);
                }
            }
        });










    }
}
