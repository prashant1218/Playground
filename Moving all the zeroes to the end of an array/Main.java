import java.util.Scanner;
class Main{
  public static void print_Zero_Last(int a[],int n)
  {
    int zero_Count=0;
    int j=0;
    int a1[]=new int[n];
    for(int i=0;i<n;i++)
    {
      if(a[i]==0)
      {
      zero_Count++;
        
        continue;
      }
      else
      {
        a1[j]=a[i];
        j++;
      }
        
    }
    for(int i=0;i<j;i++)
    {
      a[i]=a1[i];
    }
    
    for(int i=j;i<j+zero_Count;i++)
      a[i]=0;
      
  }
    public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int[] arr=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
      print_Zero_Last(arr,size);
      for(int i=0;i<size;i++)
      {
        System.out.print(arr[i]);
        System.out.print(" ");
      }
      
       // Type your code here
    }
}