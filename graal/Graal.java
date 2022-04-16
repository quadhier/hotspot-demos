public class Graal {

  static int i;
  static volatile int v;

  static void ifstmt() {
    if (i > 3) {
      v = 1;
    } else {
      v = 2;
    }
  }

  static void loop() {
    for (int i = 0; i < 10; i++) {
      v = i + 1;
    }
  }

  public static void main(String[] args) {
    ifstmt();
    loop();
  }
}
