import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
       Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n=(n1%10)+n1/100;
      System.out.println(n);
	}
}