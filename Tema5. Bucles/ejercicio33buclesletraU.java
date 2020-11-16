public class ejercicio33buclesletraU {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura de la U: ");
    int h = Integer.parseInt(System.console().readLine());
    for( int i = 0; i < h; i++){
      for( int j = 1; j <= h; j++){
        if( i == h - 1){
          if( j == 1 || j == h ){
            System.out.print(" ");
          }else{
            System.out.print("*");
          }
        }else if( j == 1 || j == h){
          System.out.print("*");
        }        
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }    
  }
}
