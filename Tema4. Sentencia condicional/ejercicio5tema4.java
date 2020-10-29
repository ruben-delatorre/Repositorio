public class ejercicio5tema4 {
  public static void main(String[] args) {
    System.out.print("Introduce el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());
  if (a == 0) {
    System.out.println("No tiene solución real.");
    } 
  else {
    System.out.println("x = " + (-b/a));
    }
  }
}
