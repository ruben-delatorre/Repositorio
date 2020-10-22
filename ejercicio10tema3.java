public class ejercicio10tema3 {
public static void main(String[] args) {
System.out.print("Introduce la cantidad de MB: ");
double MB = Double.parseDouble(System.console().readLine());
int kB = (int) (MB * 1000);
System.out.print(MB + " MB son " + kB + " kB. ");
}
}
