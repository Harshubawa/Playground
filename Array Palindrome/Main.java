import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
        arr[i] = in.nextInt();
      int l,r;
      int flag =0;
      l=0;
      r=arr_size-1;
      
      while(l<r)
      {
        if(arr[l] == arr[r])
        {
          l++;
          r--;
        }
        else
        {
          flag = 1;
          break;
        }
      }
      if(flag==1)
        System.out.println("No");
      else
            System.out.println("Yes");                 
    }
}