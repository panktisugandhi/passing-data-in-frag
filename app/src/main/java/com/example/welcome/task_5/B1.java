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

public class B1 extends Fragment {

    private Button btn2,btn3;
    private TextView TV_sem;
    private EditText ET_sem;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.b1,container,false);
        btn2 = (Button) view.findViewById(R.id.button2);
        btn3 = (Button) view.findViewById(R.id.button3);
        TV_sem = (TextView) view.findViewById(R.id.textView2);
        ET_sem = (EditText) view.findViewById(R.id.editText2);
        final String na=getArguments().getString("key1");
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                C1 c = new C1();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Bundle bundle = new Bundle();
                String sem = ET_sem.getText().toString();
                bundle.putString("key1",na);
                bundle.putString("key2",sem);
                c.setArguments(bundle);
                ft.replace(R.id.main_lin,c);
                ET_sem.setText("");
                ft.addToBackStack("");
                ft.commit();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });
        return view;
    }
}
