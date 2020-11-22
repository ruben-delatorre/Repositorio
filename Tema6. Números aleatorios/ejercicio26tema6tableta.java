public class ejercicio26tema6tableta {
  public static void main(String[] args) {
    
    System.out.print("Introduzca la anchura de la tableta: ");
    int w = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la altura de la tableta: ");
    int h = Integer.parseInt(System.console().readLine());
    
    int randomY = (int)(Math.random() * h);
    int randomX = 0;
    int pointerX = 0;
    
    if(randomY == 0 || randomY == h-1) {
      randomX = (int)(Math.random() * w);
      pointerX = randomX;
    }else{
      randomX = (int)(Math.random() * 2);
      if(randomX == 0) {
        pointerX = 0;
      }else{
        pointerX = w-1;
      }
    }
    
    for(int i = 0; i < h; i++) {
      for(int j = 0; j < w; j++) {
        if(randomY == i && pointerX == j) {
          System.out.print(" ");
        }else{
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}
