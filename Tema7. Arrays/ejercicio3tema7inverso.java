public class ejercicio3tema7inverso {
  public static void main(String[] args) {
    
    int n[]=new int[10];
    
    for(int i=0;i<10;i++){
      System.out.print("Introduce un número: ");
      n[i] = Integer.parseInt(System.console().readLine());
    }
    
    for(int j=9;j>=0;j--){
      System.out.println(n[j]);
    }
    
  }
  
}
