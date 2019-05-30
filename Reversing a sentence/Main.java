import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int str_len = str.length();
      StringBuilder sb = new StringBuilder(str);
      reverse_string(sb,0,str_len-1);
      
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      StringBuilder temp = new StringBuilder("");
      int k=0;
      for(int i =end_idx;i>=0;i--)
      { 
        if(sb.charAt(i) != ' ')
        {   k++;
         continue;
        }
         for(int j=i+1;j<=i+k;j++)
           temp.append(sb.charAt(j));
         temp.append(" ");
        k = 0;
        
      }
      temp.append(sb.charAt(0));
      System.out.println(temp);
    }
}