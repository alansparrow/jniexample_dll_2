#include "sdk_JNIClassB.h"
#include <stdio.h>

/*
 * Class:     sdk_JNIClassB
 * Method:    intMethod
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_sdk_JNIClassB_intMethod
  (JNIEnv *env, jobject obj, jint n)
{
    printf("Java_sdk_JNIClassB_intMethod: %d\n", n);
    return n;
}

/*
 * Class:     sdk_JNIClassB
 * Method:    booleanMethod
 * Signature: (Z)Z
 */
JNIEXPORT jboolean JNICALL Java_sdk_JNIClassB_booleanMethod
  (JNIEnv *env, jobject obj, jboolean b)
{

}

/*
 * Class:     sdk_JNIClassB
 * Method:    stringMethod
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_sdk_JNIClassB_stringMethod
  (JNIEnv *env, jobject obj, jstring s)
{

}

/*
 * Class:     sdk_JNIClassB
 * Method:    intArrayMethod
 * Signature: ([I)I
 */
JNIEXPORT jint JNICALL Java_sdk_JNIClassB_intArrayMethod
  (JNIEnv *env, jobject obj, jintArray arr)
{

}