package com.example.weezy.ecommerce.Method;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.weezy.ecommerce.R;
import com.example.weezy.ecommerce.ImageFromUrl;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Alex on 17/01/2018.
 */

public class CategorieAdapter extends ArrayAdapter<Categorie>{

    private ArrayList<Categorie> liste;

    private Context contexte;

    public CategorieAdapter(Context context, ArrayList<Categorie> liste){

        super(context,0,liste);
        this.contexte=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Categorie uneCategorie = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_liste_categorie, parent, false);
        }
        TextView tvNom = (TextView) convertView.findViewById(R.id.cl_nom);
        tvNom.setText(uneCategorie.getNomCateg());

        ImageView icone= (ImageView) convertView.findViewById(R.id.cl_visuel);
        if(icone.getDrawable()==null) try {


            icone.setImageDrawable(Drawable.createFromStream(contexte.getAssets().open(uneCategorie.getVisuel()),null));
            //ImageFromUrl ifu= new ImageFromUrl(this.activite, icone, substitut);
            //ifu.execute(""+uneCategorie.getVisuel());
        } catch (IOException ioe) {

        }
        return convertView;
    }
}

