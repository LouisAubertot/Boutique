package com.example.weezy.ecommerce;

import com.example.weezy.ecommerce.Method.Categorie;
import com.example.weezy.ecommerce.RequeteSQL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Alex on 13/02/2018.
 */

public class CategorieDAO implements DAO<Categorie> {

private final String URL_SERVEUR="lien fichier php";

private ActiviteEnAttenteAvecResultat activite;

private CategorieDAO(ActiviteEnAttenteAvecResultat activite){
    this.activite=activite;

}
@Override
    public void findAll(){
    RequeteSQL req= new RequeteSQL(activite,this);
    req.execute(URL_SERVEUR+"nom.php");
}
@Override
    public void insert(Categorie objet){

        RequeteSQL req=new RequeteSQL(activite,this);
        string url= URL_SERVEUR+"page_insertion.php";
        String params="?nom"+objet.getNom()+"&visuel="+objet.getVisuel();
        req.execute();
}


@Override
    public void traiteFindAll(String result){

    ArrayList<Categorie> liste= new ArrayList<Categorie>();
    try{
        JSONArray array= new JSONArray(result);
        for (int i=0; i < array.length();i++){
            JSONObject row= array.getJSONObject(i);
            Categorie c=new Categorie(row.getInt("id_categorie"),
                    row.getString("nom"),
                    row.getString("visuel"));
            liste.add(c);
        }
        this.activite.notifyRetourRequeteFindAll(liste);
    }catch(JSONException je){
        System.out.println("pb json" +je);
    }
}
}
