public class ejercicio24tema6randomdigit {
  public static void main(String[] args) {
    
    System.out.print("Introduzca un número entero positivo: ");
    long num = Long.parseLong(System.console().readLine());
    long aux = num;
    int counter = 0;
    
    while( aux > 0) {
      counter++;
      aux /= 10;
    }
    int random = (int)(Math.random() * counter) + 1;
    
    while( random > 1 ) {
      num /= 10;
      random--;
    }
    System.out.println(num % 10);
  }
}
