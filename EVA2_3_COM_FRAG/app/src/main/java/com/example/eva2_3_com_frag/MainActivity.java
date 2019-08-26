package com.example.eva2_3_com_frag;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RedFragment redFragment;
    BlueFragment blueFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);

        if(fragment.getClass() == RedFragment.class){
            redFragment = (RedFragment) fragment;
        }else if(fragment.getClass() == BlueFragment.class){
            blueFragment = (BlueFragment) fragment;
        }
    }

    public void fromFragmentToMain(String sender, String msg){
        if(sender.equals("RED")){

        }else{//FRAGMENTO AZUL
            redFragment.fromMainToFragment(msg);
        }
    }
}
