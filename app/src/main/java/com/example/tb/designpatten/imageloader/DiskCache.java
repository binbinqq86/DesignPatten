package com.example.tb.designpatten.imageloader;

import android.graphics.Bitmap;

/**
 * Created by tb on 2017/4/30.
 * //SD卡缓存DiskCache类
 */

public class DiskCache implements ImageCache{

    @Override
    public void put(String url, Bitmap bitmap) {
        //将bitmap写入文件中
    }

    @Override
    public Bitmap get(String url) {
        return null;//从本地文件中获取该图片
    }
}
