import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n;i++)
      arr[i] = in.nextInt();
    int index = 0;
    for(int i=1 ;i<n;i++)
    {
       if(arr[i]>arr[index])
         index = i;
    }
    System.out.println(index);
  }
}