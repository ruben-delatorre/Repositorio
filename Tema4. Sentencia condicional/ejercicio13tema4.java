public class ejercicio13tema4 {
  public static void main(String[] args) {
    int aux; 
    
    System.out.println("Introduce los 3 números uno por uno: ");
    int a = Integer.parseInt(System.console().readLine());
    int b = Integer.parseInt(System.console().readLine());
    int c = Integer.parseInt(System.console().readLine());
    
    if (a > b) {
    aux = a;
    a = b;
    b = aux;
    }
    
    if (b > c) {
    aux = b;
    b = c;
    c = aux;
    }
    
    if (a > b) {
    aux = a;
    a = b;
    b = aux;
    }
    
    System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c + ".");
  }
}



