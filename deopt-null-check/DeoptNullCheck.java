public class DeoptNullCheck {

  int value;

  public static void foo(DeoptNullCheck dnc) {
    System.out.println(dnc.value);
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      foo(new DeoptNullCheck());
    }
    foo(null);
  }
}
