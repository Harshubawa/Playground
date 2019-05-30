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
    int r = n/3;
    int sum1=0,sum2=0;
    int k=3,flag=1;
    for( int j=0;j<3;j++)
          sum1+=arr[j];
    for(int i=1;i<r;i++)
    { 
       for( int j=1;j<=3;j++)
          sum2+=arr[k++];
        if(sum1==sum2)
          flag++;
         else
           break;
       sum2=0;
    }
    if(flag==r)
      System.out.println("Perfect Batch");
    else
       System.out.println("Not a Perfect Batch");
  }
}