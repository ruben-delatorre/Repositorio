public class ejercicio17tema6pecera {
  public static void main(String[] args) {
    System.out.println("Introduzca el ancho de la pecera(mínimo de 4): ");
    int width = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca la altura de la pecera(mínimo de 4): ");
    int h = Integer.parseInt(System.console().readLine());
    int x = (int)(Math.random() * ( width - 2) + 1);
    int y = (int)(Math.random() * ( h - 2 ) + 1);
    System.out.println(x + " " + y);
    for(int i = 0; i < h; i++){
      for( int j = 0; j < width; j++){
        if( i == 0 || i == h - 1){
          System.out.print("*");
        }else if( j == 0 || j == width - 1){
          System.out.print("*");
        }else if( x == j && y == i ){
          System.out.print("&");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
  
