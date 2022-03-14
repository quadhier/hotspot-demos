# JDK_VER    :=
# FLAVOR     :=
# JAVAC_OPTS :=
# HS_OPTS    :=
# PROG_ARGS  :=

JDK_VER    := jdk8u
FLAVOR     := release
MAIN_CLASS := LongTTSP

COMP_CMD   := -XX:CompileCommand="compileonly LongTTSP.loop ()V" \

HS_OPTS    := $(COMP_CMD) \
							-Xcomp \
#							-XX:+SafepointTimeout \
#							-XX:+UnlockDiagnosticVMOptions \
							-XX:+PrintAssembly \

include ../Makefile.common
