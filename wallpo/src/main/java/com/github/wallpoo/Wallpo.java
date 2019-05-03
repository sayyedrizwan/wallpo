package com.github.wallpoo;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class Wallpo {


    private static Context context;

    public static WallpaperManager setMainScreenWallpaper(Activity activity, ImageView imageView, String message){

        Bitmap bitmap;

        WallpaperManager manager = WallpaperManager.getInstance(activity);


        try {
            bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
            manager.setBitmap(bitmap);
            Toast.makeText(activity, message, Toast.LENGTH_SHORT).show();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }


    public static WallpaperManager setLockScreenWallpaper(Activity activity, ImageView imageView, String message){

        Bitmap bitmap;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            WallpaperManager manager = WallpaperManager.getInstance(activity);

            try {
                manager.setBitmap(((BitmapDrawable) imageView.getDrawable()).getBitmap(), null, true, WallpaperManager.FLAG_LOCK);

                Toast.makeText(activity, message, Toast.LENGTH_SHORT).show();



            } catch (IOException e) {
                e.printStackTrace();
            }

        }else {
            Toast.makeText(activity, "Not supported with the version", Toast.LENGTH_SHORT).show();
        }
        return null;

    }

}
