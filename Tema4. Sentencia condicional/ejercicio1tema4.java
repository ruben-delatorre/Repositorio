public class ejercicio1tema4 {
  public static void main(String[] args) {
    String asignatura;
    System.out.print("Introduce un día de la semana: ");
    asignatura = (System.console().readLine());
  switch(asignatura) {
    case "lunes":
    System.out.println("Programación");
    break;
    case "martes":
    System.out.println("Sistemas informáticos");
    break;
    case "miercoles":
    System.out.println("Programación");
    break;
    case "jueves":
    System.out.println("Programación");
    break;
    case "viernes":
    System.out.println("Sistemas informáticos");
    break;
    case "sábado":
    System.out.println("No tienes clase este día");
    break;
    case "domingo":
    System.out.println("No tienes clase este día");
    break;
    default:
    System.out.println("No existe ese día de la semana");
    }
  }
}
