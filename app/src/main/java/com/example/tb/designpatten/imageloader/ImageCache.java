package com.example.tb.designpatten.imageloader;

import android.graphics.Bitmap;

/**
 * Created by tb on 2017/4/30.
 */

public interface ImageCache {

    public void put(String url, Bitmap bitmap);

    public Bitmap get(String url);
}
