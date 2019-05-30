import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      key=26-key;
      int offset;
      if(ch>='a' && ch<= 'z')
      {  offset = ch - 'a';
         offset = (key + offset)%26;
         ch =(char) ('a'+offset);
      }
      else if(ch>='A' && ch<='Z')
      {
       offset = ch - 'A';
        offset= (offset + key)%26;
        ch = (char) ('A' + offset);
      }
      System.out.println(ch);
        
        
    }
}