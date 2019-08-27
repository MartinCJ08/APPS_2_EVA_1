package com.example.eva1_4_fragmentos_dinamicos;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class RedFragment extends Fragment {


    public RedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_red, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.wtf("RED","onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.wtf("RED","onCreate");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.wtf("RED","onPause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.wtf("RED","onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.wtf("RED","onDetach");
    }

}
