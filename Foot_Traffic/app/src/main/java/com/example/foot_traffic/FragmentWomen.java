package com.example.foot_traffic;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class FragmentWomen extends Fragment implements View.OnClickListener {

    Intent intent;
    View view;
    ImageView img_nike, img_adidas, img_aldo, img_jimmychoo, img_salvotoreferragamo, img_sergiorossi;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_women,container,false);

        img_nike =(ImageView) view.findViewById(R.id.img_nikew);
        img_nike.setOnClickListener(this);

        img_adidas =(ImageView) view.findViewById(R.id.img_adidasw);
        img_adidas.setOnClickListener(this);

        img_aldo =(ImageView) view.findViewById(R.id.img_aldow);
        img_aldo.setOnClickListener(this);

        img_jimmychoo =(ImageView) view.findViewById(R.id.img_jimmychoow);
        img_jimmychoo.setOnClickListener(this);

        img_salvotoreferragamo =(ImageView) view.findViewById(R.id.img_salvotoreferragamow);
        img_salvotoreferragamo.setOnClickListener(this);

        img_sergiorossi =(ImageView) view.findViewById(R.id.img_sergiorossiw);
        img_sergiorossi.setOnClickListener(this);

        return view;

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.img_nikew:

                intent = new Intent(getActivity(), WNikeNested.class);
                startActivity(intent);
                break;

            case R.id.img_adidasw:

                intent = new Intent(getActivity(), WAdidasNested.class);
                startActivity(intent);
                break;

            case R.id.img_aldow:

                intent = new Intent(getActivity(), WAldoNested.class);
                startActivity(intent);
                break;

            case R.id.img_jimmychoow:

                intent = new Intent(getActivity(), WJimmyChooNested.class);
                startActivity(intent);
                break;

            case R.id.img_salvotoreferragamow:

                intent = new Intent(getActivity(), WSelvatoreFerragamoNested.class);
                startActivity(intent);
                break;

            case R.id.img_sergiorossiw:

                intent = new Intent(getActivity(), WSergioRossiNested.class);
                startActivity(intent);
                break;

        }

    }

}