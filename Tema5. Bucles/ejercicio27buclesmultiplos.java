public class ejercicio27buclesmultiplos {
  public static void main(String[] args) {
    System.out.print("Introduzca el número deseado: ");
    int num = Integer.parseInt(System.console().readLine());
    int sum = 0;
    int acc = 0;
    String show = "";
    for( int i = 1; i <= num; i++){
      if( i % 3 == 0 ){
        show += i + " ";
        sum += i;
        acc++;
      }
    }
    System.out.println("Los múltiplos de 3 son: " + show);
    System.out.println("Tenemos en total " + acc + " múltiplos, los cuales dan un total de " + sum);
  }
}
  
