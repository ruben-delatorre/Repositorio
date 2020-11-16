public class ejercicio32buclesparesysuma {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero positivo: ");
    long num = Long.parseLong(System.console().readLine());
    long aux = num;
    long result = 0;
    int sum = 0;
    String output = "";
    while( aux > 0 ){
      if( (aux % 10) % 2 == 0){
        result = (result * 10) + (aux % 10);
        sum += aux % 10;
        output = " " + (aux % 10) + output;
      }
      aux /= 10;
    }
    System.out.println(output);
    System.out.println("La suma de los digitos pares es: " + sum);
    
  }
}  
