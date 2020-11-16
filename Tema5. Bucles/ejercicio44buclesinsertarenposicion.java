public class ejercicio44buclesinsertarenposicion {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero positivo: ");
    long num = Long.parseLong(System.console().readLine());
    System.out.print("Introduzca la posición donde desea insertar: ");
    int pos = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el dígito que desea insertar: ");
    int insert = Integer.parseInt(System.console().readLine());
    long aux = num;
    int counter = 0;
    long result = 0;
    long reverse = 0;
    while( aux > 0 ){
      counter++;
      aux /= 10;
    }
    for( int i = 0; i < (counter - pos) + 1; i++){
      result = (result * 10) + (num % 10);
      num /= 10;
    }
    num = (num * 10) + insert;
    counter = 0;
    while( result > 0 ){
      reverse = (reverse * 10) + (result % 10);
      counter++;
      result /= 10;
    }
    for( int i = 0; i < counter; i++){
      num *= 10;
    }
    reverse += num;
    System.out.println("El número resultante es " + reverse);
  }
}
