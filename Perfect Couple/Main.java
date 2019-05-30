import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
       Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];
       for(int index = 0; index <= arr_size - 1; index++)
           arr[index] = in.nextInt();
         int value = in.nextInt();
         for(int i=0;i<arr_size;i++)
         {
           for(int j=i+1;j<arr_size;j++)
           {
             if(arr[i]+arr[j]==value)
               System.out.println(arr[i]+", "+arr[j]);
           }
         }
             
    }
}
