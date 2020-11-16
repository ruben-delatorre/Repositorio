public class ejercicio21buclesmediaimparespares {
  public static void main(String[] args) {
    int countTotal = 0;
    int impCount = 0;
    int num = 0;
    int imp = 0;
    int par = 0;
    do{
      System.out.print("Introduzca un número: ");
      num = Integer.parseInt(System.console().readLine());
      if( num >= 0 ){
        countTotal++;
        if( num % 2 != 0 ){
          imp += num;
          impCount++;
        } else{
          if( par < num ){
            par = num;
          }
        }
      }
    }while( num >= 0 );
    System.out.println("La media de los impares es " + (imp / impCount) + " y el mayor par es " + par);
  }
}  
