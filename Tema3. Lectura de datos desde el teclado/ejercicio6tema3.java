public class ejercicio6tema3 {
public static void main(String[] args) {
System.out.print("Introduce el valor de la base: ");
double base = Double.parseDouble(System.console().readLine());
System.out.print("Introduce el valor de la altura: ");
double altura = Double.parseDouble(System.console().readLine());
System.out.println("El área del rectángulo es " + (base * altura/2) + " cm²");
}
}
