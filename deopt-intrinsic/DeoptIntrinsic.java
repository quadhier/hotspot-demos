public class DeoptIntrinsic {

  public static void foo(Object o) {
    java.lang.reflect.Array.getLength(o);
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      foo(new int[1]);
    }
    foo(new Object());
  }
}
