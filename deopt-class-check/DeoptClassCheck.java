public class DeoptClassCheck {

  int value;

  public static void foo(Object o) {
    System.out.println(((DeoptClassCheck) o).value);
  }

  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      foo(new DeoptClassCheck());
    }
    foo(new Object());
  }
}
