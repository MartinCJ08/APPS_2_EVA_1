package com.example.eva2_3_com_frag;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class RedFragment extends Fragment implements FragmentComunication{
    View viewRed;
    TextView txtVwMsg;
    public RedFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        viewRed = inflater.inflate(R.layout.fragment_red, container, false);
        txtVwMsg = viewRed.findViewById(R.id.txtVwMsg);
        return viewRed;
    }

    @Override
    public void fromMainToFragment(String msg) {
        //Aqui asignamos el texto
        txtVwMsg.setText(msg);
    }
}
