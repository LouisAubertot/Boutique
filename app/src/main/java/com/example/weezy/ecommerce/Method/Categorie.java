package com.example.weezy.ecommerce.Method;

import java.util.ArrayList;

import com.example.weezy.ecommerce.Method.CategorieAdapter;
/**
 * Created by Weezy on 17/01/2018.
 */

public class Categorie {


    private String nomCateg;
    private String visuel;


    public Categorie(String nomCat, String visu) {

        setNomCateg(nomCat);
        setVisuel(visu);

    }

    public String getNomCateg() {
        return nomCateg;
    }

    public void setNomCateg(String nomCateg)
    {
        if(nomCateg==null||nomCateg.trim().length()==0)
        {
            throw new IllegalArgumentException("Le nom de la categorie est vide");
        }
        this.nomCateg = nomCateg;
    }

    public String getVisuel() {
        return visuel;
    }

    public void setVisuel(String visuel) {

        this.visuel = visuel;
    }
    


}
