public class ejercicio26buclesposiciones {
  public static void main(String[] args) {
    System.out.print("Introduzca un número: ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca un dígito: ");
    int digit = Integer.parseInt(System.console().readLine());
    int aux = num;
    int acc = 0;
    int volt = 0;
    while( aux > 0 ){
      acc++;
      aux /= 10;
    }
    for( int i = 1; i <= acc; i++){
      volt = (volt * 10) + (num % 10);
      num /= 10;
    }
    for( int j = 1; j <= acc; j++){
      if(volt % 10 == digit){
        System.out.println("El dígito lo tenemos en la posición: " + j);
      }
      volt /= 10;
    }
  }
}  
