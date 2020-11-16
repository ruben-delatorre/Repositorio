public class ejercicio28buclesfactorial {
  public static void main(String[] args) {
    int total = 1;
    int num = -1;
    do{
      System.out.print("Introduzca el número al que desea hacer el cálculo( ha de ser mayor que 0): ");
      num = Integer.parseInt(System.console().readLine());
    }while( num < 0 );
    if( num == 0 ){
      System.out.println(num + "!= " + 1);
    }else{
      for( int i = num; i >= 1; i--){
        total *= i;
      }
      System.out.println(num + "!= " + total);
    }
  }
}
