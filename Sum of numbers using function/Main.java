import java.util.Scanner;
class Main{
  
   public static int Sum(int n)
   {
     int sum=0;
     for(int i=1;i<=n;i++)
       sum+=i;
     return sum;
   }
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
      int n =in.nextInt();
      int sol = Sum(n);
      System.out.println(sol);
	}
}