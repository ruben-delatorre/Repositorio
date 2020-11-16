public class ejercicio36buclescapicua {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero positivo: ");
    long num = Long.parseLong(System.console().readLine());
    long aux = num;
    int counter = 0;
    long reverse = 0;
    boolean result = true;
    while( aux > 0 ){
      reverse = (reverse * 10) + (aux % 10);
      aux /= 10;
      counter++;
    }
    if( counter == 1 ){
      result = true;
    }else{
      aux = num;
      for( int i = 0; i < counter / 2; i++){
        if(aux % 10 != reverse % 10){
          result = false;
        }
        aux /= 10;
        reverse /= 10;
      }
    }
    if( result == true ){
      System.out.println("El número: " + num + " es capicúa");
    }else{
      System.out.println("El número: " + num + " no es capicúa");
    }
  }
}
