public class ejercicio11tema4 {
  public static void main(String[] args) {
    System.out.println("Introduce la hora y luego los minutos.");
    System.out.print("hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("minuto: ");
    int minuto = Integer.parseInt(System.console().readLine());
    int segundosTranscurridos = (hora * 3600) + (minuto * 60);
    int segundosHastaMedianoche = (24 * 3600) - segundosTranscurridos;
    System.out.println("Faltan " +segundosHastaMedianoche + " segundos.");
  }
}

