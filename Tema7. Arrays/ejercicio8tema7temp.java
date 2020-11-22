public class ejercicio8tema7temp {
  public static void main(String[] args) {
    
    int[] graphic = new int[12];
    
    for( int i = 0; i < 12; i++){
      System.out.print("Introduzca la temperatura media del mes " + (i + 1) + " : ");
      int temp = Integer.parseInt(System.console().readLine());
      graphic[i] = temp;
    }
    
    for( int i = 0; i < 12; i++){
      System.out.print("Mes " + (i+1) + " : ");
      for( int j = 0; j < graphic[i]; j++){
        System.out.print("*");
      }
      
      System.out.println();
    }
  }
}
