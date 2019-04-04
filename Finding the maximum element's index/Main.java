import java.util.Scanner;
class Main
{
  public static int maxIndex(int[] list,int n)
  {
    int max=list[0];
    int index=0;
    for(int i=1;i<n;i++)
    {
      if(max<list[i])
      {
        max=list[i];
        index=i;
      }
    }
    return index;
  }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] list=new int[n];
    for(int i=0;i<n;i++)
    {
      list[i]=sc.nextInt();
    }
    int index=maxIndex(list,n);
    System.out.println(index);
    //Try your code here
  }
}