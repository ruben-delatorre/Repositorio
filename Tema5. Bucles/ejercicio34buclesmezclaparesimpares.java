public class ejercicio34buclesmezclaparesimpares {
  public static void main(String[] args) {
    System.out.print("Introduzca el primer número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el segundo número: ");
    int num2 = Integer.parseInt(System.console().readLine());
    int num1Reverse = 0;
    int num2Reverse = 0;
    long totalPares = 0;
    long totalImpares = 0;
    int contador = 0;
    while( num2 > 0 ){
      num1Reverse = (num1Reverse * 10) + (num1 % 10);
      num2Reverse = (num2Reverse * 10) + (num2 % 10);
      num1 /= 10;
      num2 /= 10;
      contador++;
    }
    for( int i = 0; i < contador; i++){
      if( ((num1Reverse % 10) % 2) == 0 ){
        totalPares = (totalPares * 10 ) + (num1Reverse % 10);
      }else{
        totalImpares = (totalImpares * 10 ) + (num1Reverse % 10);
      }
      if( ((num2Reverse % 10) % 2)== 0 ){
        totalPares = (totalPares * 10 ) + (num2Reverse % 10);
      }else{
        totalImpares = (totalImpares * 10 ) + (num2Reverse % 10);
      }
      num1Reverse /= 10;
      num2Reverse /= 10;
    }
    System.out.println("El número par formado por los números introducidos es: " + totalPares);
    System.out.println("El número par formado por los números introducidos es: " + totalImpares);
  }
}  
