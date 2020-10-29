public class ejercicio6tema4 {
  final static double g = 9.81;
  public static void main(String[] args) {
    System.out.print("Introduzca la altura desde la que cae el objeto: ");
    Double h = Double.parseDouble(System.console().readLine());
    double s = Math.sqrt(2*h/g);
    System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
  }
}
