import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int fact,sum=0,r;
      while(temp>0)
      { fact=1;
        r=temp%10;
         for(int i=1;i<=r;i++)
              fact=fact*i;
         sum+=fact;
         temp/=10;
      }
      if(sum==n)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}