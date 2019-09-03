package com.example.eva1_6_frag_orientacion;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG_MY_FRAGMENT = "myFragment";
    private BlueFragment blueFragment;
    private RedFragment redFragment;

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();

        if(savedInstanceState == null){
            if(getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT){
                blueFragment = new BlueFragment();
                fragmentTransaction.replace(R.id.fragBluePorta, blueFragment,TAG_MY_FRAGMENT);
                fragmentTransaction.commit();
            }else{
                blueFragment = new BlueFragment();
                redFragment = new RedFragment();
                fragmentTransaction.replace(R.id.fragBlue, blueFragment);
                fragmentTransaction.replace(R.id.fragRed, redFragment);
                fragmentTransaction.commit();
            }
        }else{
            blueFragment = (BlueFragment) getSupportFragmentManager().findFragmentByTag(TAG_MY_FRAGMENT);
        }

    }
}
