import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=2;i<=n;i++)
      {  int  p = isPrime(i);
          if(p==1)
             System.out.println(i);
      }
    }
      public static int isPrime(int p) {
        int flag=0;
        for(int i=2;i<p;i++)
        {
          if(p%i==0)
             flag++;
        }
        if(flag==0)
          return 1;
        return 0;
      }

   
}