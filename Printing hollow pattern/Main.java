import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in= new Scanner(System.in);
      int n = in.nextInt();
      for(int i=1;i<=n;i++)
        System.out.print("*");
      for(int j=1;j<=n-2;j++)
      { System.out.print("\n");
        System.out.print("*");
         for(int k=1;k<=n-2;k++)
              System.out.print(" ");
         System.out.print("*");
      }
       System.out.print("\n");
      for(int i=1;i<=n;i++)
        System.out.print("*");
      
      
	}
}