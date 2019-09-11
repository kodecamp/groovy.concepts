package concepts;

public class Demo {
  public static void main(String[] args) {
    String name = null;
    Demo demo = new Demo();
    Integer value = Integer.valueOf(5);
    System.out.println(demo.method(value));
  }

  int method(String arg) {
    return 1;
  }

  int method(Object arg) {
    return 2;
  }
}
