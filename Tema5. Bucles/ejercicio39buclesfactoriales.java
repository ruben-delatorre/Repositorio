public class ejercicio39buclesfactoriales {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero positivo: ");
    int num = Integer.parseInt(System.console().readLine());
    int result = 1;
    for( int i = 1; i <= num; i++){
      for( int j = 1; j <= i; j++){
        result *= j;
      }
      System.out.println(i + "! = " + result);
      result = 1;
    }
  }
}
