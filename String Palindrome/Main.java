import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int str_len = str.length();
      int i = 0;
      int j = str_len - 1;
      int flag = 0;
      while(i<j)
      {
        if( str.charAt(i) != str.charAt(j))
        {
          flag++;
          break;
        }
        i++;
        j--;
      }
      if(flag == 0)
        System.out.println("Yes");
      else
          System.out.println("No");
    } 
}