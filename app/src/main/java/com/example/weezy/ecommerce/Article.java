package com.example.weezy.ecommerce;

/**
 * Created by Weezy on 09/01/2018.
 */

public class Article {

    private Float tarif;
    private String ref;
    private String nom;
    private String visuel;


    public Float getTarif() {
        return tarif;
    }

    public void setTarif(Float tarif) {
        this.tarif = tarif;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVisuel() {
        return visuel;
    }

    public void setVisuel(String visuel) {
        this.visuel = visuel;
    }
}
