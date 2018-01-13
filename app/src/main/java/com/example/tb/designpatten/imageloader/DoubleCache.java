package com.example.tb.designpatten.imageloader;

import android.graphics.Bitmap;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by tb on 2017/4/30.
 * //双缓存DoubleCache类
 */

public class DoubleCache implements ImageCache{
    private ImageCache mMemoryCache=new MemoryCache();
    private ImageCache mDiskCache=new DiskCache();

    //将图片缓存到内存和sd卡中
    @Override
    public void put(String url, Bitmap bitmap) {
        FileOutputStream fileOutputStream=null;
        try {
            fileOutputStream=new FileOutputStream(url);
            bitmap.compress(Bitmap.CompressFormat.JPEG,100,fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            CLoseUtils.closeQuietly(fileOutputStream);
        }
    }

    //先从内存缓存中获取图片，如果没有，再从SD卡中获取
    @Override
    public Bitmap get(String url) {
        Bitmap bitmap = mMemoryCache.get(url);
        if(bitmap==null){
            bitmap=mDiskCache.get(url);
        }
        return bitmap;
    }

}
