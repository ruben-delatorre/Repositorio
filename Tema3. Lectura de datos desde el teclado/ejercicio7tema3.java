public class ejercicio7tema3 {
public static void main(String[] args) {
System.out.print("Introduce el precio: ");
double baseImponible = Double.parseDouble(System.console().readLine());
System.out.printf("Base imponible %8.2f\n", baseImponible);
System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
System.out.printf("-----------------------\n");
System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));
}
}
