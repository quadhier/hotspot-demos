interface Intf {
  void foo();
}

public class LambdaExpr {
  static int i = 0;

  static void foo(Intf intf) {
    intf.foo();
  }

  public static void main(String[] args) {
    final int c = 3;
    int cnt = 0;
    while (cnt < 10000) {
      foo(() -> {
        System.out.println(i);
        System.out.println(c);
        try {
          Thread.sleep(1000);
        } catch (Exception e) {

        }
      });
      cnt++;
    }
  }
}
