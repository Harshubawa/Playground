import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int f = num %  10;
      while(num >9)
          num/=10;
      int sum = f+ num;
      System.out.println(sum);
	}
}