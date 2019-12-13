package com.example.fragmentobutton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private View frag;
    private Button but;
    private CheckBox ck;
    private int [] dibujos={R.drawable.capitanamarvel,R.drawable.spiderman,R.drawable.dr,R.drawable.ironman};
    private int stak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ck=(CheckBox)findViewById(R.id.aparece);
        frag=(View)findViewById(R.id.miFrg);

        but=(Button)findViewById(R.id.buttonView);


        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFragment();
            }
        });
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


        if(savedInstanceState==null){//esto hace se apilen los fragmentos uno encima de otro y para saber la posicion
            Fragment miFragment=MyFragment.newInstance(dibujos[0],stak);
            FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.miFrg,miFragment);
            fragmentTransaction.commit();
        }else{
            stak=savedInstanceState.getInt("position");
        }



    }
    public void addFragment(){
        Fragment fragment;
        Random random=new Random();
        stak++;
        fragment=MyFragment.newInstance(dibujos[random.nextInt(dibujos.length)],stak);
        FragmentTransaction tran=getFragmentManager().beginTransaction();
        tran.replace(R.id.miFrg,fragment);
        tran.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        tran.addToBackStack(null);
        tran.commit();

    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState){
        super.onSaveInstanceState(outState,outPersistentState);
        outState.putInt("position",stak);
    }

    
}
