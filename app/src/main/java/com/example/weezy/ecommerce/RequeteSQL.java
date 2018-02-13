package com.example.weezy.ecommerce;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


/**
 * Created by Alex on 07/02/2018.
 */

public class RequeteSQL extends AsyncTask<String,Void,String> {

    private ActiviteEnAttenteAvecResultat activite;
    private DAO dao;

    public RequeteSQL(ActiviteEnAttenteAvecResultat activite, DAO dao)
    {
        this.activite=activite;
        this.dao=dao;
    }

    @Override
    protected String doInBackground(String...urls)
    {
        Log.i("dib",urls[0]);
        String urlRequete=urls[0];
        StringBuffer resultat= new StringBuffer(1024);

        try {
            final HttpURLConnection conn = (HttpURLConnection) new URL(urlRequete).openConnection();
            conn.setReadTimeout(10000);
            conn.setConnectTimeout(15000);
            conn.setRequestMethod("GET");
            conn.setDoInput(true);

            conn.connect();
            InputStream input = conn.getInputStream();

            BufferedReader in = new BufferedReader(new InputStreamReader(input));
            String line = "";
            while ((line = in.readLine()) != null) {
                resultat.append(line);
            }
            in.close();
        }catch (Exception e){
            return "Error : "+e.getMessage();

        }
        return resultat.toString();
    }
    @Override
    protected void onPostExecute(String result){

        if (result.startsWith("[")){
            this.dao.traiteFindAll(result);
        }
        else{
            this.activite.notifyRetourRequete(result);
        }
    }

}
