public class ejercicio4tema3 {
  public static void main(String[] args) {
    int x;
    int y;
    String linea;
    System.out.print("Introduce el primer número: ");
    linea = System.console().readLine();
    x = Integer.parseInt( linea );
    System.out.print("Introduce el segundo número: ");
    linea = System.console().readLine();
    y = Integer.parseInt( linea );
    System.out.println(x + "+" + y + "=" + (x + y));
    System.out.println(x + "-" + y + "=" + (x - y));
    System.out.println(x + "*" + y + "=" + (x * y));
    System.out.println(x + "/" + y + "=" + (x / y));
  }
}
