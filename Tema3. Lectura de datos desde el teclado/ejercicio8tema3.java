public class ejercicio8tema3 {
  public static void main(String[] args) {
    System.out.print("Introduce el número de horas trabajadas durante la semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    System.out.println("El salario semanal es de " + (horasTrabajadas * 12) + " euros.");
  }
}
