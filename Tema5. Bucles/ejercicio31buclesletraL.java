public class ejercicio31buclesletraL {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura que desea: ");
    int h = Integer.parseInt(System.console().readLine());
    h *= 2;
    for( int i = 1; i <= h; i++){
    if( i == h){
      for( int j = 1; j <= (h / 4); j++){
        System.out.print(" *");
      }
    }else if( i % 2 != 0 ){
        System.out.print("*");
      }else{
        System.out.println();
      }
    }
  }
}
