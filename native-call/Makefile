NATIVE_CALL_DIR := $(abspath $(dir $(lastword $(MAKEFILE_LIST))))

# JDK_VER    :=
# FLAVOR     :=
# JAVAC_OPTS :=
# HS_OPTS    :=
# MAIN_CLASS :=
# PROG_ARGS  :=

JDK_VER    := jdk8u
FLAVOR     := slowdebug
MAIN_CLASS := NativeCall

HS_OPTS    := -Djava.library.path=$(NATIVE_CALL_DIR) \
              -XX:+PrintJNIResolving \
              -XX:+PrintInterpreter \
              -XX:+LogVMOutput \
              -XX:+TraceSafepoint \

include ../Makefile.common

# compile dynamic-link library
JNI_INCLUDE := -I$(BUILT_JDK_DIR)/include/ \
               -I$(BUILT_JDK_DIR)/include/linux/
buildso:
	gcc $(JNI_INCLUDE) -g -shared -o lib$(MAIN_CLASS).so $(MAIN_CLASS).c
rmso:
	rm -f lib$(MAIN_CLASS).so

