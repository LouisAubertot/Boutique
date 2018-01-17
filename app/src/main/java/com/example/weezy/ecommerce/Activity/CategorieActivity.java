package com.example.weezy.ecommerce.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.example.weezy.ecommerce.Method.Categorie;
import com.example.weezy.ecommerce.Method.CategorieAdapter;
import com.example.weezy.ecommerce.R;

public class CategorieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    @Override
    public void onStart(){
        super.onStart();

        CategorieAdapter adaptateur= new CategorieAdapter(this.getContext(),liste);
        ListView listeView= getActivity().findViewById(R.id.cf_liste);
        listeView.setAdapter(adaptateur);
    }

}
