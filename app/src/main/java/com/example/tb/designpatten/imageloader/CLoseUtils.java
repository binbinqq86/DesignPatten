package com.example.tb.designpatten.imageloader;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by tb on 2017/4/30.
 */

public class CLoseUtils {
    private CLoseUtils(){

    }

    public static void closeQuietly(Closeable closeable){
        if(closeable!=null){
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
