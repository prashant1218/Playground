import java.util.Scanner;
import java.lang.Math;
class Main
{
  public static double power(double base,double exp)
  {
    double ans=Math.pow(base,exp);
    return ans;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    double base=in.nextDouble();
    double exp=in.nextDouble();
    System.out.println(power(base,exp));
  }
}
    