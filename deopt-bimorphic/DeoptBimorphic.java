interface I {
  void goo();
} 

class A implements I {
  public void goo() {
    System.out.println("A");
  }
}

class B implements I {
  public void goo() {
    System.out.println("B");
  }
}

class C implements I {
  public void goo() {
    System.out.println("C");
  }
}

public class DeoptBimorphic {

  public static void foo(I inf) {
    inf.goo();
  }

  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();

    for (int i = 0; i < 50; i++) {
      foo(a);
      foo(b);
    }

    foo(c);
  }
}
