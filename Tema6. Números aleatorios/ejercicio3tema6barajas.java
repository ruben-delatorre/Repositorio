public class ejercicio3tema6barajas {
  public static void main(String[] args) {
    
    String palo = "";
    String carta = "";
    
    switch((int)(Math.random()*4)) {
      case 0:
        palo = "oros";
        break;
      case 1:
        palo = "copas";
        break;
      case 2:
        palo = "bastos";
        break;
      case 3:
        palo = "espadas";
        default:
    }
    
    int numeroCarta = (int)(Math.random()*11) + 1;
    
    switch(numeroCarta) {
      case 1:
        carta = "As";
        break;
      case 8:
        carta = "Sota";
        break;
      case 9:
        carta = "Caballo";
        break;
      case 10:
        carta = "Rey";
        break;
      default:
        carta = String.valueOf(numeroCarta);
    }
    
    System.out.println(carta + " de " + palo);
  }
}


