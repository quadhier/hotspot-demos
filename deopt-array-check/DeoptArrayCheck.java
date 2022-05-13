public class DeoptArrayCheck {

  public static void foo(Object[] o) {
    o[0] = new Object();
    System.out.println(o[0]);
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      foo(new Object[1]);
    }

    DeoptArrayCheck[] vals = new DeoptArrayCheck[5];
    foo(vals);
  }
}
