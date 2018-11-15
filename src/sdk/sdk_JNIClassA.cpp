#include "sdk_JNIClassA.h"
#include <stdio.h>

/*
 * Class:     sdk_JNIClassA
 * Method:    intMethod
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_sdk_JNIClassA_intMethod
  (JNIEnv *env, jobject obj, jint n)
{
    printf("Java_sdk_JNIClassA_intMethod: %d\n", n);
    return n;
}

/*
 * Class:     sdk_JNIClassA
 * Method:    booleanMethod
 * Signature: (Z)Z
 */
JNIEXPORT jboolean JNICALL Java_sdk_JNIClassA_booleanMethod
  (JNIEnv *env, jobject obj, jboolean b)
{

}

/*
 * Class:     sdk_JNIClassA
 * Method:    stringMethod
 * Signature: (Ljava/lang/String;)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_sdk_JNIClassA_stringMethod
  (JNIEnv *env, jobject obj, jstring s)
{

}

/*
 * Class:     sdk_JNIClassA
 * Method:    intArrayMethod
 * Signature: ([I)I
 */
JNIEXPORT jint JNICALL Java_sdk_JNIClassA_intArrayMethod
  (JNIEnv *env, jobject obj, jintArray arr)
{

}