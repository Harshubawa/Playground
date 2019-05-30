import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int str_len = str.length();
      int arr[] = new int[26];
      char ch;
      for(int  i=0;i<26;i++)
        arr[i] =0;
      for(int i=0;i<str_len;i++)
      {  ch = str.charAt(i);
         if(ch>='a' && ch<='z')
           arr[ch-'a']++;
         else if(ch>='A' && ch<='Z')
            arr[ch-'A']++;
      }
      for(int i=0;i<26;i++)
      {
        if(arr[i]==0)
          System.out.print((char)(i+'a')+" ");
      }
    }
}