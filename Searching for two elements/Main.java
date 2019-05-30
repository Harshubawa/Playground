import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int i=0;i<arr_size;i++)
        arr[i]=in.nextInt();
      int search_elem_1=in.nextInt();
      int search_elem_2=in.nextInt();
      int index1=-1,index2=-1;
      for(int i=0;i<arr_size;i++)
      {
        if(search_elem_1 == arr[i])
            index1 = i;
          if(search_elem_2 == arr[i])
            index2= i;
       }
      System.out.println(index1);
       System.out.println(index2);
         
    }
}