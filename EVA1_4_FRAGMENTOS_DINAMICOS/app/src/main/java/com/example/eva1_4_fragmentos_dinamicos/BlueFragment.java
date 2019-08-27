package com.example.eva1_4_fragmentos_dinamicos;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class BlueFragment extends Fragment {

    public BlueFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blue, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.wtf("BLUE","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.wtf("BLUE","onCreate");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.wtf("BLUE","onPause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.wtf("BLUE","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.wtf("BLUE","onDetach");
    }
}
