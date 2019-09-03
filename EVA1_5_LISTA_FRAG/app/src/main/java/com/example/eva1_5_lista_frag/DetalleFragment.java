package com.example.eva1_5_lista_frag;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.eva1_5_lista_frag.dummy.DummyContent;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleFragment extends Fragment {
    TextView txtMsg;
    String msg=  "";

    public DetalleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_detalle, container, false);
        txtMsg = v.findViewById(R.id.txtMsg);
        txtMsg.setText(msg);
        return v;
    }

    public void onMainToFrag(DummyContent.DummyItem di){
        msg = di.content;
    }

}
