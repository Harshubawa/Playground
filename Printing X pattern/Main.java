import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int p=n/2;
      int q=n-2;
      for(int i=1;i<=p;i++)
      { for(int s=1;s<=i-1;s++)
           System.out.print(" ");
        System.out.print("*");
        for(int j=1;j<=q;j++)
           System.out.print(" ");
        System.out.print("*");
        q=q-2;
        System.out.print("\n");
       
      }
      for(int i=1;i<=p;i++)
        System.out.print(" ");
      System.out.print("*");
     System.out.print("\n");
      q=1;
       for(int i=1;i<=p;i++)
      { for(int s=1;s<=p-i;s++)
           System.out.print(" ");
        System.out.print("*");
        for(int j=1;j<=q;j++)
           System.out.print(" ");
        System.out.print("*");
        q=q+2;
       System.out.print("\n");
      }
        
      
      
	}
}