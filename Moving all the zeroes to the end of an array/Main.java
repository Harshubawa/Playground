import java.util.Scanner;
class Main{
    public static void rotate(int arr[],int n,int i)
    {
      for(int j=i;j<n-1;j++)
        arr[j]=arr[j+1];
      arr[n-1]=0;
    }
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
        arr[i] = in.nextInt();
      for(int i=0;i<n;i++)
      {
        if(arr[i]==0)
            rotate(arr,n,i);
       if(arr[i]==0)
          rotate(arr,n,i);
      }
      for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
}