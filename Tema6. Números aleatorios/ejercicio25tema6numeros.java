public class ejercicio25tema6numeros {
  public static void main(String[] args) {
    
    int random = 0;
    boolean primo = true;
    
    for( int i = 0; i < 100; i++) {
      primo = true;
      random = (int)(Math.random() * 191) + 10;
      
      for( int j = 2; j < random; j++) {
        if( random % j == 0) {
          primo = false;
        }
      }
      
      if( primo ){
        System.out.print("#" + random + "#" + " ");
      }else if( random % 5 == 0 ){
        System.out.print("[" + random + "]" + " ");
      }else{
        System.out.print(random + " ");
      }
    }
  }
}
      
