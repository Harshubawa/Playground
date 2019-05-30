import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n =in.nextInt();
      char flag = '#';
      for(int i=1;i<=n;i++)
      {   for(int j=1;j<=i;j++)
             {   if(flag=='*')
                   {  System.out.print("#");
                       flag='#';
                   }
                  else
                  {
                    System.out.print("*");
                       flag='*';
                  }
             }
          System.out.print("\n");
      }
             
   }
}