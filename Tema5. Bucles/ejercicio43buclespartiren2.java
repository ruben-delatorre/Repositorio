public class ejercicio43buclespartiren2 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero positivo: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
    int pos = Integer.parseInt(System.console().readLine());
    int result = 0;
    int reverse = 0;
    int aux = num;
    int contador = 0;
    int position = 0;
    while ( aux > 0 ){
      contador++;
      aux /= 10;
    }
    position = contador - pos;
    for( int i = 0; i <= position; i++){
      result = ( result * 10 ) + ( num % 10 );
      num /= 10;
    }
    while( result > 0 ){
      reverse = ( reverse * 10 ) + ( result % 10 );
      result /= 10;
    }
    System.out.println("Los números partidos son el " + num + " y el " + reverse);
  }
}
