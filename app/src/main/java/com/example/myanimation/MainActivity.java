package com.example.myanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void senddata(int val) {
        FragmentManager fm = getSupportFragmentManager();
        img_fragment Fb = new img_fragment();
        Fb.doanimation(val);
    }
}