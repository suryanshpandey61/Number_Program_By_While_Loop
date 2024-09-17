import java.util.Scanner;
class Program10
{
  public static void checkMultipleIsEven(int n)
  {
    int res=1;
    while(n>0)
    {
      int rem=n%10;
      res=res*rem;
      n=n/10;
    }
   System.out.println("Product of all digits is :"+res);
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any value:=");
    int n=sc.nextInt();
    checkMultipleIsEven(n);
  }
}