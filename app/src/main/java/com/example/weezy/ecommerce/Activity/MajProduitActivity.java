package com.example.weezy.ecommerce.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.weezy.ecommerce.R;

/**
 * Created by Weezy on 03/03/2018.
 */

public class MajProduitActivity extends AppCompatActivity {

    private EditText etNomArticle;
    private EditText etDescriArticle;
    private EditText etPrixArticle;
    private String nomArticle;
    private String descriArticle;
    private String prixArticle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maj_nom_article);

        if(savedInstanceState!=null){
            this.nomArticle=savedInstanceState.getString("nom");
            this.descriArticle=savedInstanceState.getString("description");
            this.prixArticle=savedInstanceState.getString("prix");
        }
        else if (this.getIntent().getExtras()==null){
            this.nomArticle="";
            this.descriArticle="";
            this.prixArticle="";
        }
        else{
            this.nomArticle=this.getIntent().getExtras().getString("nom");
            this.descriArticle=this.getIntent().getExtras().getString("description");
            this.prixArticle=this.getIntent().getExtras().getString("prix");
        }
    }

    @Override
    public void onStart(){
        super.onStart();

        this.etNomArticle=this.findViewById(R.id.md_nom_article);
        this.etDescriArticle=this.findViewById(R.id.md_description_article);
        this.etPrixArticle=this.findViewById(R.id.md_prix_article);
    }

    public void onClickConfirmer(View v){

        String nomArticle=this.etNomArticle.getText().toString().trim();
        String descriArticle=this.etDescriArticle.getText().toString().trim();
        String prixArticle=this.etPrixArticle.getText().toString().trim();


        if(nomArticle.length()==0) {
            Toast.makeText(this, "Le nom est vide", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent donnees= new Intent();
            donnees.putExtra("nom",this.etNomArticle.getText().toString().trim());
            this.finish();
        }


        if(descriArticle.length()==0){
            Toast.makeText(this, "La description est vide", Toast.LENGTH_SHORT).show();
        }else
        {
            Intent donnees= new Intent();
            donnees.putExtra("nom",this.etDescriArticle.getText().toString().trim());
            this.finish();
        }


        if(prixArticle.length()==0){
            Toast.makeText(this, "Le prix est vide", Toast.LENGTH_SHORT).show();
        }else
        {
            Intent donnees= new Intent();
            donnees.putExtra("nom",this.etPrixArticle.getText().toString().trim());
            this.finish();
        }

    }

    public void onClickAnnuler(View v)
    {
        this.finish();
    }

    @Override
    public void onBackPressed()
    {
        this.onClickAnnuler(null);
    }

}
