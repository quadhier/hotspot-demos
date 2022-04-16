import sun.misc.Unsafe;
import java.lang.reflect.Field;

public class Visibility {

  static int i;
  static final long OFFSET_I;

  static final Unsafe UNSAFE;
  static {
    try {
      Field unsafe = Unsafe.class.getDeclaredField("theUnsafe");
      unsafe.setAccessible(true);
      UNSAFE = (Unsafe) unsafe.get(null);
      OFFSET_I = UNSAFE.staticFieldOffset(Visibility.class.getDeclaredField("i"));
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    }
  }

  public static void set() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ie) {

    }

    UNSAFE.putIntVolatile(Visibility.class, OFFSET_I, 2);
    System.out.println("Has set 'Visibility.i' to " + 2);
  }

  public static void get() {
    while (i != 2) ;
    System.out.println("Done");
  }

  public static void main(String[] args) {
    System.out.println("Here we go");

    Thread t1 = new Thread(() -> set());
    Thread t2 = new Thread(() -> get());

    t1.start();
    t2.start();
  }
}
