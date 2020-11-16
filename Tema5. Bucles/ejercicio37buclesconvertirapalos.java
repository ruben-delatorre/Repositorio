public class ejercicio37buclesconvertirapalos {
  public static void main(String[] args) {
     System.out.print("Introduzca el número entero positivo: ");
    long num = Long.parseLong(System.console().readLine());
    long aux = num;
    long reverse = 0;
    int counter = 0;
    while( aux > 0 ){
      reverse = (reverse * 10) + (aux % 10);
      counter++;
      aux /= 10;
    }
    for( int j = 0; j < counter; j++){
      aux = reverse % 10;
      reverse /= 10;
     for( int i = 0; i < aux; i++){
        System.out.print("| ");
      }
      if( j != counter - 1 ){
        System.out.print("- ");
      }
    }
  }
}
