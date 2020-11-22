public class ejercicio19tema6parimpar {
  public static void main(String[] args) {
    int max = -101;
    int min = 201;
    int sum = 0;
    for( int i = 0; i < 50; i++){
      int mixer = (int)(Math.random() * 2);
      int num = (int)(Math.random() * 201);
      if( mixer == 0 && num <= 100){
        num *= -1;
      }
      sum += num;
      if( num % 2 == 0 && num > max ){
        max = num;
      }
      if( num % 2 != 0 && num < min ){
        min = num;
      }
      System.out.print(num + " ");
    }
    System.out.println();
    System.out.println("La media es: " + sum / 50);
    System.out.println("El número más pequeño impar generado ha sido: " + min);
    System.out.println("El número más alto par generado ha sido: " + max);
    
  }
}
