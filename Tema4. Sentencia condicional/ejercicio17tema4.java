public class ejercicio17tema4 {
  public static void main(String[] args) {
    System.out.print("Introduce un número entero: ");
    int n = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número es: " + (n % 10));
  }
}
