import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int rem;
    int newNo;
   
    rem=n%10;
     n/=10;
    newNo=rem*100;
    rem=n%10;
    n/=10;
    newNo+=rem*10+n;
    System.out.println(newNo);
     
     
   
    
    
  }
}