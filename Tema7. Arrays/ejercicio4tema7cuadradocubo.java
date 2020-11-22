public class ejercicio4tema7cuadradocubo {
  public static void main(String[] args) {
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    int i;
    
    for (i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = cuadrado[i] * numero[i];
    }
    
    for (i = 0; i < 20; i++) {
      System.out.printf("%-5d %-5d %-5d\n", numero[i], cuadrado[i], cubo[i]);
    }
  }
}

