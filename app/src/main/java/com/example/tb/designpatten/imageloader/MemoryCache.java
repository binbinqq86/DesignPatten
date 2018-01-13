package com.example.tb.designpatten.imageloader;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by tb on 2017/4/30.
 * //内存缓存MemoryCache类
 */

public class MemoryCache implements ImageCache{
    private LruCache<String,Bitmap> mMemoryCache;

    public MemoryCache(){
        //初始化Lru缓存
    }
    @Override
    public void put(String url, Bitmap bitmap) {
        mMemoryCache.put(url,bitmap);
    }

    @Override
    public Bitmap get(String url) {
        return mMemoryCache.get(url);
    }
}
