public class ejercicio45buclescambiarenposicion {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero positivo: ");
    long num = Long.parseLong(System.console().readLine());
    System.out.print("Introduzca la posición dentro del número: ");
    int pos = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el nuevo dígito: ");
    int insert = Integer.parseInt(System.console().readLine());
    long aux = num;
    long left = num;
    long right = num;
    int counter = 0;
    long result = 0;
    while(aux > 0){
      counter++;
      aux /= 10;
    }
    left = ((left / (long)Math.pow(10,(counter - (pos - 1))) * 10) + insert);
    right = right % (long)Math.pow(10,(counter - pos));
    result = (left * (long)Math.pow(10,(counter - pos))) + right;
    System.out.println(result);
  }
}
