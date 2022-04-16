# JDK_VER    :=
# FLAVOR     :=
# JAVAC_OPTS :=
# HS_OPTS    :=
# PROG_ARGS  :=

JDK_VER    := jdk8u
FLAVOR     := slowdebug
MAIN_CLASS := Visibility

COMP_CMD   := -XX:CompileCommand="compileonly Visibility.set" \
              -XX:CompileCommand="compileonly Visibility.get" \

HS_OPTS    := $(COMP_CMD) \
              -Xcomp \
              -XX:-Inline \
              -XX:+PrintCompilation \
              -XX:+PrintAssembly \

include ../Makefile.common
