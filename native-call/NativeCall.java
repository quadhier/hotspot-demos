public class NativeCall {

  static {
    System.loadLibrary("NativeCall");
  }

  public static native void hello();

  public static void alloc() {
    while (true) {
      Object ref = new Object[1000_000];
    }
  }

  public static void main(String[] args) {
    Thread t1 = new Thread() {
      @Override
      public void run() {
        hello();
      }
    };
    t1.setName("hello");

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
