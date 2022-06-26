package com.example.exericio6_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements LeftFragment.OnFragmentInteractionListener {


    private RightFragment resultFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultFragment = (RightFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_view);
    }

    @Override
    public void onFragmentInteraction(String text) {
        resultFragment.definirCorFundo(text);
    }
}