public class ejercicio24buclespiramidenumeros {
  public static void main(String[] args) {
    System.out.println("Introduzca la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    
    for( int i = 1; i <= h; i++){
      for( int j = 1; j <= h - i; j++){
        System.out.print(" ");
      }
      for(int k = 1; k <= i; k++){
        System.out.print(k);
      }
      for( int g = i - 1; g >= 1; g--){
        System.out.print(g);
      }
      System.out.println();
    }
  }
}
