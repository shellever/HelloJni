package com.shellever.hellojni;

/**
 * Author: Shellever
 * Date:   12/16/2016
 * Email:  shellever@163.com
 */

public class HelloJni {

    // A native method that is implemented by the 'hello-jni' native library (libhello-jni.so)
    public native static String getStringFromJni();
}
