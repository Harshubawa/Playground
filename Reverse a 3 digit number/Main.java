import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
     Scanner in=new Scanner(System.in);
       int n=in.nextInt();
      int r=(n%10)*100;
      n/=10;
      r+=(n%10)*10;
      n/=10;
     r+=n;
    System.out.println(r);
  }
}