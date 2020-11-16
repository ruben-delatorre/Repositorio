public class ejercicio38buclesrelojdearena {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura del reloj de arena: ");
    int h = Integer.parseInt(System.console().readLine());
    int aux = h;
    int counter = 0;
    if( h % 2 != 0 && h >= 3 ){
      for( int i = 0; i <= h / 2; i++ ){
        for( int l = 0; l < i; l++){
          System.out.print(" ");
        }
        counter = 0;
        while( counter < aux ){
          System.out.print("*");
          counter++;
        }
        aux -= 2;
        System.out.println();
      }
      for( int i = 1; i <= h / 2; i++){
        for( int l = 0 ; l < (h / 2) - i; l++){
          System.out.print(" ");
        }
        for( int j = 0; j < (i * 2) + 1; j++){
          System.out.print("*");
        }
        System.out.println();
      }
    }else{
      System.out.println("El número ha de ser impar y mayor o igual a 3");
    }
  }
}
