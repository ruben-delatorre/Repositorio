public class ejercicio28tema6array {
  public static void main(String[] args) {
    
    System.out.print("Introduzca el tamaño del array: ");
    int size = Integer.parseInt(System.console().readLine());
    
    int[] arr = new int[size];
    int[] result = new int[size];
    int counter1 = 0;
    int counter2 = size - 1;
    
    for( int i = 0; i < size; i++) {
      arr[i] = (int)(Math.random() * 201);
      if( i % 2 == 0 ) {
        result[counter1++] = arr[i];
      }else{
        result[counter2--] = arr[i];
      }
    }
    for( int i = 0; i < size; i++){
      System.out.print( arr[i] + " ");
    }
    System.out.println();
    for( int i = 0; i < size; i++){
      System.out.print( result[i] + " ");
    } 
  }   
}
