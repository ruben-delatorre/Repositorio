public class ejercicio23buclessumahasta1000 {
  public static void main(String[] args) {
    int num;
    int total = 0;
    int acc = 0;
    do{
      System.out.print("Introduzca el número: ");
      num = Integer.parseInt(System.console().readLine());
      acc++;
      total += num;
    }while( total <= 10000 );
      System.out.println("El total acumulado es " + total + ",se han introducido " + acc + " números con una media de " + (total / acc));
  }
}
