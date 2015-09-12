public class Adder extends Arithmetic {
  
  @Override
  public void add(int a, int b) {
    System.out.println("My super class is: " + super.getClass().getName());
    System.out.println(a + " " + b + " " + (a+b));    
  }
  
  public static void main(String[] args) {
    Adder adder = new Adder();
    adder.add(42,13);
  }
}