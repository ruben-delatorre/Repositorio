public class ejercicio40buclesrombo {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura del rombo: ");
    int h = Integer.parseInt(System.console().readLine());
    int aux = h - 2;
    int counter = 0;
    if( h % 2 != 0 && h >= 3 ){
      for(int i = 1; i <= (h / 2) + 1; i++){
        for( int j = 0; j <= ( h / 2 ) - i; j++){
          System.out.print(" ");
        }
        for( int k = 0; k < ( 2 * i ) - 1; k++){
          if( k == 0 || k == ( 2 * i ) - 2 ){
            System.out.print("*");
          }else{
            System.out.print(" ");
          }
        }
        System.out.println();
      }
      for( int i = 0; i < h / 2; i++){
        for( int j = 0; j <= i; j++){
          System.out.print(" ");
        }
        counter = 0;
        while ( counter < aux ){
          if((counter == 0) || (counter == aux - 1)){
            System.out.print("*");
          }else{
            System.out.print(" ");
          }
          counter++;
        }
        System.out.println();
        aux -= 2;
      }
    }else{
      System.out.println("La altura ha de ser impar y mayor o igual a 3");
    }
  }
}
