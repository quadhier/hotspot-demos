# JDK_VER    :=
# FLAVOR     :=
# JAVAC_OPTS :=
# HS_OPTS    :=
# PROG_ARGS  :=

JDK_VER    := jdk8u
FLAVOR     := slowdebug
MAIN_CLASS := CompiledCode

COMP_CMD   := -XX:CompileCommand="compileonly CompiledCode.loop ()V" \

HS_OPTS    := $(COMP_CMD) \
							-Xcomp \
							-XX:+LogVMOutput \
							-XX:+PrintAssembly \

include ../Makefile.common
