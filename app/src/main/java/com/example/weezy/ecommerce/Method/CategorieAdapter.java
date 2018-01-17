package com.example.weezy.ecommerce.Method;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.weezy.ecommerce.R;

import java.util.ArrayList;

/**
 * Created by Alex on 17/01/2018.
 */

public class CategorieAdapter extends ArrayAdapter<Categorie>{

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
        return ;
    }
}

