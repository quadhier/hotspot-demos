public class DeoptUnstableIf {
  public static void foo(Object o) {
    if (o == null) {
      System.out.println("is null");
    } else {
      System.out.println("is not null");
    }
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      foo(new Object());
    }

    foo(null);
  }
}
