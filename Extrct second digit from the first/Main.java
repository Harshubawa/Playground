import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      while(num>99)
          num/=10;
      System.out.println(num%10);
    }
}