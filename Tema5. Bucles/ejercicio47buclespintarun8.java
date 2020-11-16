public class ejercicio47buclespintarun8 {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura (número impar mayor o igual a 5): ");
    int h = Integer.parseInt(System.console().readLine());
    if(h % 2 != 0 && h >= 5){
      for( int i = 0; i < h; i++){
        for( int j = 1; j <= 6; j++){
          if(i == 0 || i == h / 2 || i == h - 1){
            System.out.print("M");
          }else{
            if(j == 1 || j == 6){
              System.out.print("M");
            }else{
              System.out.print(" ");
            }
          }
        }
        System.out.println();
      }
    }else{
      System.out.println("Error, la altura introducida no es correcta");
    }
  }
}
