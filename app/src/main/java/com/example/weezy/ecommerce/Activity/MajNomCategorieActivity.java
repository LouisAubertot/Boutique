package com.example.weezy.ecommerce.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weezy.ecommerce.R;

public class MajNomCategorieActivity extends AppCompatActivity {

    private EditText etNom;
    private TextView etTitre;
    private String nomCateg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maj_nom_categorie);

        if(savedInstanceState!=null){
            this.nomCateg=savedInstanceState.getString("nom");
        }
        else if (this.getIntent().getExtras()==null){
            this.nomCateg="";
        }
        else{
            this.nomCateg=this.getIntent().getExtras().getString("nom");
        }
    }


    @Override
    public void onStart(){
        super.onStart();

        this.etNom=this.findViewById(R.id.md_nom);
        this.etTitre=this.findViewById(R.id.md_titre);
    }

    public void onClickConfirmer(View v){

        String nomCateg=this.etNom.getText().toString().trim();
        if(nomCateg.length()==0){
            Toast.makeText(this, "Le nom est vide", Toast.LENGTH_SHORT).show();
        }
        else{
            Intent donnees= new Intent();
            donnees.putExtra("nom",this.etNom.getText().toString().trim());
            this.finish();
        }


    }

    public void onClickAnnuler(View v){

        this.finish();
    }

    @Override
    public void onBackPressed(){
        this.onClickAnnuler(null);
    }
}
