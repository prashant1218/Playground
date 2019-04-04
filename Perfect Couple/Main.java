import java.util.Scanner;
class Main{
  public static void pairSum(int a[],int n,int value)
  {
    int sum=0;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        sum=a[i]+a[j];
        if(sum==value)
        {
          System.out.println(a[i]+", "+a[j]);
        }
      }
      
    }
  }
  
    public static void main(String args[]) 
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      int[] a=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
      }
      int value=sc.nextInt();
      pairSum(a,n,value);
      // Type your code here
    }
}