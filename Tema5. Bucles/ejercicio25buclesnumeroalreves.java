public class ejercicio25buclesnumeroalreves {
  public static void main(String[] args) {
    int acc = 0; 
    int calc;
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    num = Math.abs(num);
    calc = num;
    while( calc > 0){
      acc++;
      calc /= 10;
    }
    for( int i = 1; i <= acc; i++){
      System.out.print(num % 10);
      num /= 10;
    } 
  }
}
