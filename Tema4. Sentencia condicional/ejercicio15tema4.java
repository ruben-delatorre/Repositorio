public class ejercicio15tema4 {
  public static void main(String[] args) {
    
    System.out.print("Introduce el carácter de relleno: ");
    String a = System.console().readLine();
    System.out.println("Elige el tipo de pirámide: ");
    System.out.println("1. Con el vértice hacia arriba");
    System.out.println("2. Con el vértice hacia abajo");
    System.out.println("3. Con el vértice hacia la izquierda");
    System.out.println("4. Con el vértice hacia la derecha");
    int opcion = Integer.parseInt(System.console().readLine());
    
    switch(opcion) {
      case 1:
        System.out.println(" " + " " + a);
        System.out.println(" " + a + a + a);
        System.out.println(a + a + a + a + a);
        break;
      case 2:
        System.out.println(a + a + a + a + a);
        System.out.println(" " + a + a + a);
        System.out.println(" " + " " + a);
        break;
      case 3:
        System.out.println(" " + " " + " " + " " + a);
        System.out.println(" " + " " + a + a + a);
        System.out.println(a + a + a + a + a);
        System.out.println(" " + " " + a + a + a);
        System.out.println(" " + " " + " " + " " + a);
        break;
      case 4:
        System.out.println(a);
        System.out.println(a + a + a);
        System.out.println(a + a + a + a + a);
        System.out.println(a + a + a);
        System.out.println(a);
        break;
      default:
    }
  }
}
