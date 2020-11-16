public class ejercicio19buclespiramide {
  public static void main(String[] args) {
    
    System.out.print("Introduce el carácter de relleno: ");
    String a = System.console().readLine();
    
    int altura;
    
    System.out.print("Introduce la altura: ");
    altura = Integer.parseInt(System.console().readLine());
    
    for (int i = 1; i <= altura; i++) {
      for (int j = 1; j <= altura-i; j++) {
        System.out.print(" ");
      }
      
      for (int k = 1; k <= 2*i-1; k++) {
        System.out.print(a);
      }
      
      System.out.println();
      
    }
  }
}
