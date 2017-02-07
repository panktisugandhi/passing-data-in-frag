package com.example.welcome.task_5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by welcome on 2/7/2017.
 */

public class C1 extends Fragment {


    private Button btn4;
    private TextView TV_main1,TV_main2;
    private EditText ET_main1,ET_main2;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.c1,container,false);
        btn4 = (Button) view.findViewById(R.id.button4);
        TV_main1 = (TextView) view.findViewById(R.id.textView3);
        ET_main1 = (EditText) view.findViewById(R.id.editText3);
        TV_main2 = (TextView) view.findViewById(R.id.textView4);
        ET_main2 = (EditText) view.findViewById(R.id.editText4);
        String name = getArguments().getString("key1");
        String sem = getArguments().getString("key2");
        ET_main1.setText(sem);
        ET_main2.setText(name);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });
        return view;
    }
}
