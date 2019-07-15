package com.github.wallpoo;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Wallpo {

    public static WallpaperManager setMainScreenWallpaper(Context context, ImageView imageView, String message) {

        Bitmap bitmap;

        WallpaperManager manager = WallpaperManager.getInstance(context);
        try {
            bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                manager.setBitmap(bitmap, null, true, WallpaperManager.FLAG_SYSTEM);
            }else {

                manager.setBitmap(bitmap);
            }

            if(message.isEmpty()){
                message = "Wallpaper set successfully";
            }
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }


    public static WallpaperManager setLockScreenWallpaper(Activity activity, ImageView imageView, String message) {


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            WallpaperManager manager = WallpaperManager.getInstance(activity);

            try {
                manager.setBitmap(((BitmapDrawable) imageView.getDrawable()).getBitmap(), null, true, WallpaperManager.FLAG_LOCK);

                if (message.isEmpty()){
                    message = "Lock Screen Wallpaper set successfully";
                }

                Toast.makeText(activity, message, Toast.LENGTH_SHORT).show();


            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            Toast.makeText(activity, "Not supported with the version", Toast.LENGTH_SHORT).show();
        }
        return null;

    }


}
