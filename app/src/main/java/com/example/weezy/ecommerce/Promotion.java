package com.example.weezy.ecommerce;

import java.util.Date;

/**
 * Created by Weezy on 09/01/2018.
 */

public class Promotion {

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Float getPourcent() {
        return pourcent;
    }

    public void setPourcent(Float pourcent) {
        this.pourcent = pourcent;
    }

    private Date dateFin;
    private Float pourcent;

}
