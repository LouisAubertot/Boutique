package com.example.weezy.ecommerce.Method;

import java.util.ArrayList;

import com.example.weezy.ecommerce.Method.CategorieAdapter;
/**
 * Created by Weezy on 17/01/2018.
 */

public class Categorie {


    private ArrayList<Categorie> liste;

    liste = new ArrayList<Categorie>();

    private String nomCateg;
    private String visuel;

    public String getNomCateg() {
        return nomCateg;
    }

    public void setNomCateg(String nomCateg) {
        this.nomCateg = nomCateg;
    }

    public String getVisuel() {
        return visuel;
    }

    public void setVisuel(String visuel) {
        this.visuel = visuel;
    }


}
