import java.util.Scanner;
class Main{
  public static int sum(int n)
  {
    int i=1;
    int sum=0;
    while(i<=n)
    {
      sum+=i;
      i++;
    }
    return sum;
  }
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int sum=sum(n);
      System.out.println(sum);
      
	    // Type your code here
	}
}