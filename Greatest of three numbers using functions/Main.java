import java.util.Scanner;
class Main{
    public static int greatest_of_2(int a,int b)
    {  if(a>b)
       return a;
       else
         return b;
    }
      
    public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int n = greatest_of_2(n1,n2);
      if(n>n3)
        System.out.println(n);
      else
        System.out.println(n);
      
	}
}