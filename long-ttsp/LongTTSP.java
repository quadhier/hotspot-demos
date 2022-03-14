public class LongTTSP {

  static volatile int blackHole;
  static void loop() {
    for (int i = 0;
         i < Integer.MAX_VALUE;
         i += 1) {
      for (int j = 0;
           j < Integer.MAX_VALUE;
           j += 1) {
        blackHole = i;
      }
    }
  }

  static void alloc() {
    while (true) {
      Object ref = new Object[1000_000];
      System.out.println(ref);
    }
  }

  public static void
      main(String[] args) {

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
