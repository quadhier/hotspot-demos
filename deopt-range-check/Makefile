# JDK_VER    :=
# FLAVOR     :=
# JAVAC_OPTS :=
# HS_OPTS    :=
# PROG_ARGS  :=

JDK_VER    := jdk8u
FLAVOR     := slowdebug
MAIN_CLASS := DeoptRangeCheck

COMP_CMD   := -XX:CompileCommand="compileonly DeoptRangeCheck.foo" \

HS_OPTS    := $(COMP_CMD) \
              -XX:-BackgroundCompilation \
              -XX:CompileThreshold=100 \
              -XX:+LogVMOutput \
              -XX:+TraceDeoptimization \

include ../Makefile.common
