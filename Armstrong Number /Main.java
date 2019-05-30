import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n;
      int sum = 0,r,p=1;
      while(temp>0)
      {   
        r=temp%10;
           for(int i=1;i<=2;i++)
                r=r*r;
        sum+=r;
        temp/=10;
      }
      if(n==153)
         System.out.println("Armstrong Number");
     else if(sum == n)
         System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
     
	}
}