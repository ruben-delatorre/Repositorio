public class ejercicio35buclesletraX {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura de la X: ");
    int h = Integer.parseInt(System.console().readLine());
    int espaciosUp = h - 2;
    int count;
    if( h % 2 != 0 || h >= 3 ){
      for( int j = 0; j <= h / 2; j++){
        for( int i = 0; i < j; i++){
          System.out.print(" ");
        }
        System.out.print("*");
        count = 0;
        while( count < espaciosUp ){
          System.out.print(" ");
          count++;
        }
        espaciosUp -= 2;
        if( j != h / 2){
        System.out.print("*");
        } 
        System.out.println();
      }
      for( int i = 0; i < (h / 2); i++){
        for(int j = 1; j < (h / 2) - i; j++){
          System.out.print(" ");
        }
        System.out.print("*");
        for( int k = 0; k < (i * 2) + 1; k++){
          System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
      }
    }else{
      System.out.println("Error, la altura ha de ser impar o igual/mayor que 3");
    }
  }
}
