public class ejercicio3tema3 {
public static void main(String[] args) {
System.out.print("Introduce la cantidad de pesetas: ");
int pesetas = Integer.parseInt(System.console().readLine());
double euros = (pesetas / 166.386);
System.out.print(pesetas + " pesetas son " + euros + " euros. ");
}
}
