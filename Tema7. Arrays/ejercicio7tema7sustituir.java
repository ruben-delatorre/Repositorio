public class ejercicio7tema7sustituir {
  public static void main(String[] args) {
    
    int[] nums = new int[100];
    for(int i = 0; i < 100; i++){
      nums[i] = (int)(Math.random() * 21);
      System.out.print( nums[i] + " ");
    }
    
    System.out.println();
    System.out.print("Introduzca el valor que quiere cambiar: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el valorc que quiere que lo sustituya: ");
    int num2 = Integer.parseInt(System.console().readLine());
    for(int i = 0; i < 100; i++){
      if( nums[i] == num1 ){
        nums[i] = num2;
        System.out.print( "\"" + nums[i] + "\"" + " ");
      }else{
        System.out.print( nums[i] + " ");
      }
    }
  }
}
