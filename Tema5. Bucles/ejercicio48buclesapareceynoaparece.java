public class ejercicio48buclesapareceynoaparece {
  public static void main(String[] args) {
    long dato;
    
    System.out.print("Introduzca un número entero: ");
    dato = Long.parseLong(System.console().readLine());
    
    System.out.print("Dígitos que aparecen en el número: ");
    
    for (int i=0; i<=9; i++) {
      long aux = dato;
      boolean digitoEncontrado = false;
      while ((aux>0)&&!digitoEncontrado) {
        if ((aux % 10) == i) {
          digitoEncontrado = true;
        }
        aux = aux / 10;
      }
      if (digitoEncontrado) {
        System.out.print(i + " ");
      }  
    }
    
    System.out.println();
    System.out.print("Dígitos que no aparecen: ");
        
    for (int i=0; i<=9; i++) {
      long aux = dato;
      boolean digitoEncontrado = false;
      while ((aux>0)&&(digitoEncontrado==false)) {
        if ((aux % 10) == i) {
          digitoEncontrado = true;
        }
        aux = aux / 10;
      }
      if (!digitoEncontrado) {
        System.out.print(i + " ");
      }
    }
  }
}
