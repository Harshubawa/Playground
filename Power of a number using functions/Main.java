import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
     Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exp = in.nextInt();
      int pw =Power(base,exp);
      System.out.println(pw);
      
	}
  public static int Power(int b,int e) {
    int pw=b;
    for(int i=2;i<=e;i++)
       pw=pw*b;
    return pw;
  }
  
    
}