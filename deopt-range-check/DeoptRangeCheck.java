public class DeoptRangeCheck {

  static int[] vals = new int[5];

  public static void foo(int i) {
    vals[i] = 0;
    System.out.println(i);
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      foo(i % 5);
    }
    foo(10);
  }
}
