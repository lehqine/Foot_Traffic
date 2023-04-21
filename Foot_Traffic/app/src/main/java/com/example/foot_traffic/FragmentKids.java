package com.example.foot_traffic;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentKids extends Fragment implements View.OnClickListener {

    Intent intent;
    View view;
    ImageView img_nike, img_adidas, img_hushpuppies, img_toms, img_keen;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_kids,container,false);

        img_nike =(ImageView) view.findViewById(R.id.img_nikek);
        img_nike.setOnClickListener(this);

        img_adidas =(ImageView) view.findViewById(R.id.img_adidask);
        img_adidas.setOnClickListener(this);

        img_hushpuppies =(ImageView) view.findViewById(R.id.img_hushpuppies);
        img_hushpuppies.setOnClickListener(this);

        img_toms =(ImageView) view.findViewById(R.id.img_toms);
        img_toms.setOnClickListener(this);

        img_keen =(ImageView) view.findViewById(R.id.img_keen);
        img_keen.setOnClickListener(this);

        return view;

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.img_nikek:

                intent = new Intent(getActivity(), KNikeNested.class);
                startActivity(intent);
                break;

            case R.id.img_adidask:

                intent = new Intent(getActivity(), KAdidasNested.class);
                startActivity(intent);
                break;

            case R.id.img_hushpuppies:

                intent = new Intent(getActivity(), KHushPuppiesNested.class);
                startActivity(intent);
                break;

            case R.id.img_toms:

                intent = new Intent(getActivity(), KTomsNested.class);
                startActivity(intent);
                break;

            case R.id.img_keen:

                intent = new Intent(getActivity(), KKeenNested.class);
                startActivity(intent);
                break;



        }

    }


}