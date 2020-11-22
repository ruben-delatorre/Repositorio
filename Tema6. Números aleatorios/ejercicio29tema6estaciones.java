public class ejercicio29tema6estaciones {
  public static void main(String[] args) {
    
    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.print("Seleccione la estación del año (1-4): ");
    int selector = Integer.parseInt(System.console().readLine());
    
    int maxTemp = 0;
    int minTemp = 0;
    int tiempo = 0;
    boolean soleado = false;
    
    switch (selector) {
      case 1: 
        maxTemp = (int)(Math.random() * 16) + 15;
        minTemp = (int)(Math.random() * ((maxTemp - 15) + 1) + 15);
        tiempo = (int)(Math.random() * 10) + 1;
        if( tiempo <= 6 ){
          soleado = true;
        }
      break;
      case 2:
        maxTemp = (int)(Math.random() * 26);
        minTemp = (int)(Math.random() * ((maxTemp - 25) + 1) + 25);
        tiempo = (int)(Math.random() * 10) + 1;
        if( tiempo <= 8 ){
          soleado = true;
        }
        break;
      
      case 3: 
        maxTemp = (int)(Math.random() * 11) + 20;
        minTemp = (int)(Math.random() * ((maxTemp - 20) + 1) + 20);
        tiempo = (int)(Math.random() * 10) + 1;
        if( tiempo <= 4 ){
          soleado = true;
        }
        break;
      
      case 4: 
        maxTemp = (int)(Math.random() * 26);
        minTemp = (int)(Math.random() * (maxTemp + 1));
        tiempo = (int)(Math.random() * 10) + 1;
        if( tiempo <= 2 ){
          soleado = true;
        }
      break;
      }
    System.out.println(maxTemp);
    System.out.println(minTemp);
    if( soleado ) {
      System.out.println("El tiempo es soleado");
    }else{
      System.out.println("El tiempo es nublado");
    }
  }
}
