import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
     Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++)
        arr[i] = in.nextInt();
     int r = in.nextInt();
    int temp,i,j;
    for(int k=1;k<=r;k++)
      {   temp = arr[1];
           i=1;
           while(i<=n-3)
           { arr[i] = arr[i+2];
            i=i+2;
           }
         arr[i]=temp;
      }
    if((n-1)%2==0)
      j=n-1;
    else
      j=n-2;
      
    for(int k=1;k<=r;k++)
    {
      temp=arr[j];
      i=j;
       while(i>=2)
       {
         arr[i]=arr[i-2];
         i=i-2;
       }
      arr[i]=temp;
    }
    for(int l=0;l<n;l++)
      System.out.print(arr[l]+" ");
          
            
  	}
}