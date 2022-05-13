# JDK_VER    :=
# FLAVOR     :=
# JAVAC_OPTS :=
# HS_OPTS    :=
# PROG_ARGS  :=

JDK_VER    := jdk8u
FLAVOR     := slowdebug
MAIN_CLASS := DeoptNullCheck

COMP_CMD   := -XX:CompileCommand="compileonly DeoptNullCheck.foo" \

HS_OPTS    := $(COMP_CMD) \
              -XX:-BackgroundCompilation \
              -XX:CompileThreshold=100 \
              -XX:+LogVMOutput \
              -XX:+TraceDeoptimization \

include ../Makefile.common
