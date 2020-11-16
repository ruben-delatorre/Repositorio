public class ejercicio22buclesprimos2y100 {
  public static void main(String[] args) {
    boolean primo = true;
    for( int i = 2; i <= 100; i++){
      primo = true;
      for( int j = 2; j < i; j++){
        if( i % j == 0 ){
          primo = false; 
        }
      }
      if( primo == true ){
        System.out.println(i);
      } 
    }
  }
}
