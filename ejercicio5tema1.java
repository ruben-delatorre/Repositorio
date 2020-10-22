public class ejercicio5tema1 {
public static void main(String[] args) {
String rojo = "\033[31m";
String verde = "\033[32m";
String naranja = "\033[33m";
String azul = "\033[34m";
String morado = "\033[35m";
String celeste = "\033[36m";
System.out.println("Lunes\tMartes\tMiérc.\tJueves.\tViernes");
System.out.println("======\t=======\t======\t=======\t=======");
System.out.println(rojo + "PROGRAM" + verde + "\tSI" + rojo + "\tPROGRAM\tPROGRAM" + verde + "\tSI");
System.out.println(rojo + "PROGRAM" + verde + "\tSI" + rojo + "\tPROGRAM\tPROGRAM" + verde + "\tSI");
System.out.println(naranja + "BD" + verde + "\tSI" + naranja + "\tBD" + rojo + "\tPROGRAM" + verde + "\tSI");
System.out.println(naranja + "BD" + rojo + "\tPROGRAM" + azul + "\tED" + naranja + "\tBD" + celeste + "\tFOL");
System.out.println(morado + "LM\tLM" + azul + "\tED" + naranja + "\tBD" + celeste + "\tFOL");
System.out.println(morado + "LM\tLM" + azul + "\tED" + naranja + "\tBD" + celeste + "\tFOL");
}
}
