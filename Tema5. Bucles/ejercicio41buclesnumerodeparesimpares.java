public class ejercicio41buclesnumerodeparesimpares {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero positivo: ");
    int num = Integer.parseInt(System.console().readLine());
    int aux = num;
    int pares = 0;
    int impares = 0;
    if( num > 0 ){
      while( num > 0 ){
        aux = num % 10;
        if( aux % 2 == 0){
          pares++;
        }else{
          impares++;
        }
        num /= 10;
      }
      System.out.println("El número introducido tiene " + pares + " dígitos pares y " + impares + " dígitos impares");
    }else{
      System.out.println("Error, el número ha de ser entero positivo");
    }
  }
}
