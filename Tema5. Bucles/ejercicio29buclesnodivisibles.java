public class ejercicio29buclesnodivisibles {
  public static void main(String[] args) {
    
    System.out.print("Introduzca el primer número: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el segundo número: ");
    int div = Integer.parseInt(System.console().readLine());
    for( int i = 1; i < num; i++){
      if( i % div != 0 ){
        System.out.print(i + " ");
      }
    }
  }
}
