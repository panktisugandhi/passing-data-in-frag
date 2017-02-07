package com.example.welcome.task_5;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A1 a = new  A1();
        FragmentManager fm1 = getSupportFragmentManager();
        FragmentTransaction ft = fm1.beginTransaction();
        ft.add(R.id.main_lin,a);
        ft.commit();


    }
}
