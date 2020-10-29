public class ejercicio3tema4 {
  public static void main(String[] args) {
    System.out.print("Introduce un número del 1 al 7: ");
    int número = Integer.parseInt(System.console().readLine());
    String día;
  switch (número) {
    case 1:
    día = "lunes";
    break;
    case 2:
    día = "martes";
    break;
    case 3:
    día = "miercoles";
    break;
    case 4:
    día = "jueves";
    break;
    case 5:
    día = "viernes";
    break;
    case 6:
    día = "sábado";
    break;
    case 7:
    día = "domingo";
    break;
    default:
    día = "no existe ese día de la semana";
    }
    System.out.println("Día " + número + ": " + día);
  }
}
