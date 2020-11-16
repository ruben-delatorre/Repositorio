public class ejercicio49buclesmaxminmed {
  public static void main(String[] args) {
    
    int conter = 0;
    int num;
    boolean check;
    int counter = 0;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int sum = 0;
    
    do{
      check = true;
      System.out.print("Vaya introduciendo números enteros positivos, para terminar introduzca un número primo: ");
      num = Integer.parseInt(System.console().readLine());
      for( int i= 2; i < num; i++){
        if( num % i == 0){
          check = false;
        }
      }
      
      if ( !check ){
        counter++;
        if( max < num ){
          max = num;
        }
        if( min > num ){
          min = num;
        }
        sum += num;
      }
    }while( !check );
    System.out.println("Ha introducido " + counter + " números no primos");
    System.out.println("Máximo: " + max);
    System.out.println("Mínimo: " + min);
    System.out.println("La media es: " + (float)sum / counter);
  }
}
    
    
