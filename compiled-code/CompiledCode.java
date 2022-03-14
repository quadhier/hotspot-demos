public class CompiledCode {

  public static volatile long blackHole;
  public static void loop() {
    for (long i = 0;
         i < Integer.MAX_VALUE;
         i++) {
      blackHole = i;
    }
  }

  public static void alloc() {
    while (true) {
      Object ref = new Object[1000_000_000];
    }
  }

  public static void main(String[] args) {
    Thread t1 = new Thread() {
      @Override
      public void run() {
        loop();
      }
    };
    t1.setName("loop");

    Thread t2 = new Thread() {
      @Override
      public void run() {
        alloc();
      }
    };
    t2.setName("alloc");
    t1.start();
    t2.start();
  }
}
