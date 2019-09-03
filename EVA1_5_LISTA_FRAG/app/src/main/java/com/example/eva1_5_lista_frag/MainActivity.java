package com.example.eva1_5_lista_frag;

import android.content.ClipData;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.eva1_5_lista_frag.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements ItemFragment.OnListFragmentInteractionListener {
    ItemFragment itemFragment;
    DetalleFragment detalleFragment;
    FragmentManager fmManager;
    FragmentTransaction fmTrans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fmManager = getSupportFragmentManager();
        itemFragment = new ItemFragment();
        fmTrans = fmManager.beginTransaction();

        fmTrans.setCustomAnimations(
                R.anim.exit_to_ritght,
                R.anim.enter_for_left,
                R.anim.exit_to_ritght,
                R.anim.enter_for_left
        );

        fmTrans.replace(R.id.frameLay,itemFragment);
        fmTrans.commit();
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {
//        Toast.makeText(this, item.content,Toast.LENGTH_SHORT).show();

        fmManager = getSupportFragmentManager();
        detalleFragment = new DetalleFragment();
        fmTrans = fmManager.beginTransaction();

        fmTrans.setCustomAnimations(
                R.anim.exit_to_ritght,
                R.anim.enter_for_left,
                R.anim.exit_to_ritght,
                R.anim.enter_for_left
        );
        fmTrans.add(R.id.frameLay,detalleFragment);
        fmTrans.addToBackStack(null);
        fmTrans.commit();
        detalleFragment.onMainToFrag(item);
    }
}
