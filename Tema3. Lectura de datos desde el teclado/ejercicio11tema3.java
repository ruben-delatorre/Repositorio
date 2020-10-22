public class ejercicio11tema3 {
  public static void main(String[] args) {
    System.out.print("Introduce la cantidad de kB: ");
    int kB = Integer.parseInt(System.console().readLine());
    double MB = (kB / 1000);
    System.out.print(kB + " kB son " + MB + " MB. ");
  }
}
