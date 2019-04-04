import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int n1=n;
      int sum=0;
      while(n>0)
      {
        int fact=1;
        int rem=n%10;
        n/=10;
        for(int i=1;i<=rem;i++)
        {
          fact*=i;
        }
        sum+=fact;
      }
      if(sum==n1)
      {
        System.out.println("Yes");
        
      }
      else
         System.out.println("No");
        
        
	    // Type your code here
	}
}