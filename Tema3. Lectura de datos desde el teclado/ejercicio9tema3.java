public class ejercicio9tema3 {
  public static void main(String[] args) {
    final double PI = 3.1416;
    System.out.print("Introduce el valor del radio del cono: ");
    double r = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el valor de la altura del cono: ");
    double h = Double.parseDouble(System.console().readLine());
    double v = (1.0/3.0) * PI * r * r * h;
    System.out.print("El volumen del cono es " + v + " cm³ ");
  }
}
