package com.example.exericio6_fragments;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LeftFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LeftFragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private Button btn_preto;
    private Button btn_azul;
    private Button btn_verde;
    private Button btn_vermelho;
    private Button btn_amarelo;
    private OnFragmentInteractionListener mListener;



    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public LeftFragment() {
        // Required empty public constructor
    }

    public static LeftFragment newInstance(String param1, String param2) {
        LeftFragment fragment = new LeftFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_left, container, false);

        btn_preto = (Button) view.findViewById(R.id.btn_preto);
        btn_azul = (Button) view.findViewById(R.id.btn_azul);
        btn_verde = (Button) view.findViewById(R.id.btn_verde);
        btn_vermelho = (Button) view.findViewById(R.id.btn_vermelho);
        btn_amarelo = (Button) view.findViewById(R.id.btn_amarelo);

        btn_preto.setOnClickListener(this);
        btn_azul.setOnClickListener(this);
        btn_verde.setOnClickListener(this);
        btn_vermelho.setOnClickListener(this);
        btn_amarelo.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {

        if(mListener != null){
            if(view.getId() == R.id.btn_preto){
                String cor = "#000000";
                mListener.onFragmentInteraction(cor);
            }
            else if (view.getId() == R.id.btn_verde){
                String cor = "#008000";
                mListener.onFragmentInteraction(cor);
            }
            else if (view.getId() == R.id.btn_azul){
                String cor = "#0000FF";
                mListener.onFragmentInteraction(cor);
            }
            else if (view.getId() == R.id.btn_vermelho){
                String cor = "#FF0000";
                mListener.onFragmentInteraction(cor);
            }
            else if (view.getId() == R.id.btn_amarelo){
                String cor = "#FFFF00";
                mListener.onFragmentInteraction(cor);
            }
        }

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String text);
    }
}