package com.example.weezy.ecommerce.Activity;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.example.weezy.ecommerce.Method.Categorie;
import com.example.weezy.ecommerce.Method.CategorieAdapter;
import com.example.weezy.ecommerce.R;

import java.util.ArrayList;

public class CategorieActivity extends Fragment{

    private ArrayList<Categorie> liste;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        liste = new ArrayList<Categorie>();
        //liste.add(new Categorie("casquette","bonjour.png"));
    }
    @Override
    public void onStart(){
        super.onStart();
        CategorieAdapter adaptateur= new CategorieAdapter(this.getContext(),liste);
        ListView listeView= getActivity().findViewById(R.id.cf_liste);
        listeView.setAdapter(adaptateur);
    }


}
