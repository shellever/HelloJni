//
// Created by shellever on 12/16/2016.
//

#include "com_shellever_hellojni_HelloJni.h"

// D:\MySoftware\MyDevelopment\Android\Sdk\ndk-bundle\platforms\android-17\arch-arm\usr\include\jni.h

JNIEXPORT jstring JNICALL Java_com_shellever_hellojni_HelloJni_getStringFromJni
  (JNIEnv *env, jclass clazz)
{
    // In C code
    return (*env)->NewStringUTF(env, "Hello from JNI!");

    // In C++ code
    // return env->NewStringUTF("Hello from JNI!");
}