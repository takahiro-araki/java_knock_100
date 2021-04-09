#include <stdio.h>
#include <stdlib.h>
#include "java_knock_100_jni_Java19.h"
#define MAX 7

/**
 * 0からMAXの整数をランダムで返す
 */
JNIEXPORT jint JNICALL Java_java_1knock_1100_jni_Java19_stringFromJNI (JNIEnv *evn, jobject obj) {
    return rand() % MAX + 1;
};

