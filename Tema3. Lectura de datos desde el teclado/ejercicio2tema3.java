public class ejercicio2tema3 {
public static void main(String[] args) {
System.out.print("Introduce la cantidad de euros: ");
double euros = Double.parseDouble(System.console().readLine());
int pesetas = (int) (euros * 166.386);
System.out.print(euros + " euros son " + pesetas + " pesetas. ");
}
}

