public class ejercicio12tema3 {
public static void main(String[] args) {
System.out.print("Introduce la nota del primer examen: ");
double nota1 = Double.parseDouble(System.console().readLine());
System.out.print("Introduce la media deseada: ");
double notaMedia = Double.parseDouble(System.console().readLine());
double nota2 = ((notaMedia * 100) - (nota1 * 40)) / 60;
System.out.println("Necesitas sacar un " + nota2 + " en el segundo examen para tener un " + notaMedia + " de media.");
}
}
