public class ejercicio42bucles5numerosprimos {
  public static void main(String[] args) {
    System.out.print("Introduzca un número entero positivio: ");
    int num = Integer.parseInt(System.console().readLine());
    boolean primo = true;
    for( int i = num; i < num + 5; i++){
      primo = true;
      for( int j = 2; j < i; j++){
        if( i % j == 0 ){
          primo = false;
        }
      }
      if( primo == true ){
        System.out.println(i + " es primo");
      }else{
        System.out.println(i + " no es primo");
      }
    }
  }
}
