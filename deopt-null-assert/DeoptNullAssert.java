public class DeoptNullAssert {

  public static boolean foo(Object o) {
    // This must be a class or interface that is not loaded yet
    return o instanceof java.util.HashMap;
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      System.out.println(foo(null));
    }
    System.out.println(foo(new DeoptNullAssert()));
  }
}
