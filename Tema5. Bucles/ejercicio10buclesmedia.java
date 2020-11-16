public class ejercicio10buclesmedia {
  public static void main(String[] args) {
    
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("Vaya introduciendo números para calcular su media.");
    System.out.println("Introduzca un número negativo para indicar que a terminado: ");
    
    while (numeroIntroducido >= 0) {
      numeroIntroducido = Double.parseDouble(System.console().readLine());
      numeros++;
      suma += numeroIntroducido;
    }

    System.out.println("La media de los números positivos introducidos es " + (suma - numeroIntroducido)/ (numeros - 1));
  }
}
