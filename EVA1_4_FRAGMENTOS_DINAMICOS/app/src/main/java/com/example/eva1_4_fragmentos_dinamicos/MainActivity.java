package com.example.eva1_4_fragmentos_dinamicos;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentManager fmManager;
    FragmentTransaction fmTrans;
    BlueFragment blueFragment;
    RedFragment redFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fmManager = getSupportFragmentManager();

    }
    public void onClickRed(View view){
        fmTrans = fmManager.beginTransaction();
        redFragment = new RedFragment();
        //fmTrans.replace(R.id.frameLay,redFragment);
        //fmTrans.commit();
        fmTrans.setCustomAnimations(
                R.anim.exit_to_ritght,
                R.anim.enter_for_left,
                R.anim.exit_to_ritght,
                R.anim.enter_for_left
        );
        fmTrans.addToBackStack(null);
        fmTrans.add(R.id.frameLay,redFragment,"RED_FRAGMENT").commit();
    }
    public void onClickBlue(View view){
        fmTrans = fmManager.beginTransaction();
        blueFragment = new BlueFragment();
        //fmTrans.replace(R.id.frameLay,blueFragment);
        //fmTrans.commit();
        fmTrans.setCustomAnimations(
                R.anim.exit_to_ritght,
                R.anim.enter_for_left,
                R.anim.exit_to_ritght,
                R.anim.enter_for_left
                );
        fmTrans.addToBackStack(null);
        fmTrans.add(R.id.frameLay,blueFragment,"BLUE_FRAGMENT").commit();
    }
}
