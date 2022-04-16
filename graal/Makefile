# JDK_VER    :=
# FLAVOR     :=
# JAVAC_OPTS :=
# HS_OPTS    :=
# PROG_ARGS  :=

JDK_VER    := jdk11u
FLAVOR     := slowdebug
MAIN_CLASS := Graal

JAVAC_OPTS := -g

COMP_CMD   := -XX:CompileCommand="compileonly Graal.*" \

HS_OPTS    := $(COMP_CMD) \
              -Xcomp \
              -XX:+LogVMOutput \
              -XX:+PrintAssembly \
              -XX:+UnlockExperimentalVMOptions \
              -XX:+UseJVMCICompiler \
              -XX:+EagerJVMCI \
              -Dgraal.Inline=false \
              -Dgraal.Dump=":1" \
              -Dgraal.PrintCompilation=true \
              -Dgraal.ShowConfiguration=verbose \
              -Dgraal.PrintCFG=true \
              -Dgraal.ShowDumpFiles=true \

include ../Makefile.common
