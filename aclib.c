#include <jni.h>
#include <stdio.h>
#include "JNIWithC.h"

JNIEXPORT void JNICALL Java_JNIWithC_sayHello (JNIEnv *env, jobject thisObj) {
  printf("I'm native C code.\n");
  return;
}

