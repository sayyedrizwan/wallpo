package com.github.wallpoo;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class Wallpo {




    public static WallpaperManager setMainScreenWallpaper(Context mContext, ImageView imageView){

        Bitmap bitmap;

        WallpaperManager manager = WallpaperManager.getInstance(mContext);


        try {
            bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
            manager.setBitmap(bitmap);
            Toast.makeText(mContext, "Set Successfully", Toast.LENGTH_SHORT).show();
          //  updatewallpaper();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return setMainScreenWallpaper(mContext, imageView);

    }



    public static WallpaperManager setLockScreenWallpaper(Context mContext, ImageView imageView){

        Bitmap bitmap;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            WallpaperManager manager = WallpaperManager.getInstance(mContext);

            try {
                manager.setBitmap(((BitmapDrawable) imageView.getDrawable()).getBitmap(), null, true, WallpaperManager.FLAG_LOCK);

                Toast.makeText(mContext, "Successfully", Toast.LENGTH_SHORT).show();



            } catch (IOException e) {
                e.printStackTrace();
            }

        }else {
            Toast.makeText(mContext, "Not supported with the version", Toast.LENGTH_SHORT).show();
        }
        return setLockScreenWallpaper(mContext, imageView);

    }


}
