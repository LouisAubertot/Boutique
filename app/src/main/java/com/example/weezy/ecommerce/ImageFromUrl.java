package com.example.weezy.ecommerce;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

/**
 * Created by Weezy on 12/01/2018.
 */

public class ImageFromUrl extends AsyncTask<String, Void, Bitmap>
{


    @Override
    protected Bitmap doInBackground(String... urls) {

        String urlIcone = urls[0];
        Bitmap icone = null;
        try {
            InputStream in = new java.net.URL(urlIcone).openStream();
            icone = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
            Log.i("pasd'icone", "substitut utilisé a la place");

        }
        return icone;
    }


/**
    protected void onPostExecute(Bitmap result)

    {
        if(result==null)
        {
            bmImage.setImageBitmap(substitut);
        }
        else
        {
            bmImage.setImageBitmap(result);
        }
        this.activite.terminePatience();
    }

**/

}
