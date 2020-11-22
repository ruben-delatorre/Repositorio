public class ejercicio5tema7maxmin {
  public static void main(String[] args) {
    
    int[] numero = new int[10];
    
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int i;
    
    System.out.println("Introduzca un número:");
    
    for (i = 0; i < 10; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
        
      if (numero[i] < min) {
        min = numero[i];
      }

      if (numero[i] > max) {
        max = numero[i];
      }
    }
    System.out.println();
    
    for (i = 0; i < 10; i++) {
      System.out.print(numero[i]);
      
      if (numero[i] == max) {
        System.out.print(" máximo");
      }
      
      if (numero[i] == min) {
        System.out.print(" mínimo");
      }
      System.out.println();
  
    }
  }
}


