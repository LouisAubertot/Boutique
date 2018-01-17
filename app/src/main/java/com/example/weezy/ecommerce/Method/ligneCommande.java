package com.example.weezy.ecommerce.Method;

/**
 * Created by Weezy on 17/01/2018.
 */

public class ligneCommande {

    private Integer id_commande;
    private Integer id_article;
    private Integer quantite;


    public Integer getId_commande() {
        return id_commande;
    }

    public void setId_commande(Integer id_commande) {
        this.id_commande = id_commande;
    }

    public Integer getId_article() {
        return id_article;
    }

    public void setId_article(Integer id_article) {
        this.id_article = id_article;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }


}
