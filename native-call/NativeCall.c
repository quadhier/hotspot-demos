#include "NativeCall.h"
#include <stdio.h>

/*
 * Class:     NativeCall
 * Method:    hello
 * Signature: ()V
 */
JNIEXPORT void JNICALL Java_NativeCall_hello(JNIEnv * env, jclass cls) {
  unsigned long long cnt = 0L;
  while (1) {
    printf("%lld-th Hello\n", cnt);
    cnt++;
  }
}
