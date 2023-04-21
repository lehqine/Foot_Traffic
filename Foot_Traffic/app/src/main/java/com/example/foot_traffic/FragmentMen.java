package com.example.foot_traffic;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentMen extends Fragment implements View.OnClickListener {

    Intent intent;
    View view;
    ImageView img_nike, img_adidas, img_drcardin, img_johnlobb, img_salvotoreferragamo, img_oxford;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view = inflater.inflate(R.layout.fragment_men,container,false);

        img_nike =(ImageView) view.findViewById(R.id.img_nike);
        img_nike.setOnClickListener(this);

        img_adidas =(ImageView) view.findViewById(R.id.img_adidas);
        img_adidas.setOnClickListener(this);

        img_drcardin =(ImageView) view.findViewById(R.id.img_drcardin);
        img_drcardin.setOnClickListener(this);

        img_johnlobb =(ImageView) view.findViewById(R.id.img_johnlobb);
        img_johnlobb.setOnClickListener(this);

        img_salvotoreferragamo =(ImageView) view.findViewById(R.id.img_salvotoreferragamo);
        img_salvotoreferragamo.setOnClickListener(this);

        img_oxford =(ImageView) view.findViewById(R.id.img_oxford);
        img_oxford.setOnClickListener(this);

        return view;

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.img_nike:

                intent = new Intent(getActivity(), MNikeNested.class);
                startActivity(intent);
                break;

            case R.id.img_adidas:

                intent = new Intent(getActivity(), MAdidasNested.class);
                startActivity(intent);
                break;

            case R.id.img_drcardin:

                intent = new Intent(getActivity(), MDrCardinNested.class);
                startActivity(intent);
                break;

            case R.id.img_johnlobb:

                intent = new Intent(getActivity(), MJohnLobbsNested.class);
                startActivity(intent);
                break;

            case R.id.img_salvotoreferragamo:

                intent = new Intent(getActivity(), MSelvatoreFerragamoNested.class);
                startActivity(intent);
                break;

            case R.id.img_oxford:

                intent = new Intent(getActivity(), MOxfordNested.class);
                startActivity(intent);
                break;

        }

    }
}