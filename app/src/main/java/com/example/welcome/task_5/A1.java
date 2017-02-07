package com.example.welcome.task_5;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by welcome on 2/7/2017.
 */

public class A1 extends Fragment {

    private Button btn1;
    private EditText ET_name;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.a1,container,false);
        btn1 = (Button) view.findViewById(R.id.button1);
        ET_name = (EditText) view.findViewById(R.id.editText1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B1 b = new B1();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                String name=ET_name.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("key1",name);
                b.setArguments(bundle);
                ft.replace(R.id.main_lin,b);
                ET_name.setText("");
                ft.addToBackStack("");
                ft.commit();

            }
        });
        return view;
    }
}
