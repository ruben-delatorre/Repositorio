public class ejercicio9tema7parimpar {
  public static void main(String[] args) {
    
    int[] num = new int[8];
    int i;
    
    System.out.print("Introduce 8 números: ");
    
    for(i=0;i<8;i++){
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    for(i=0;i<8;i++){
      if(num [i]%2==0){
        System.out.println(num[i]+": par ");
      }else{
        System.out.println(num[i]+": impar ");
      }
    }
    
    
  }
  
}
