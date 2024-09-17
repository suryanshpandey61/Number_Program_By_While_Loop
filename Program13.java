import java.util.Scanner;
class Program13
{

  public static int getFactorial(int a)
  {
    int fact=1;
    while(a>0)
    {
      fact=fact*a;
      a--;
    }
   return fact;    
  }  

  public static void getFactorialDigit(int n)
  {
    while(n>0)
    {
      int rem=n%10;
      int factorial=getFactorial(rem);
      System.out.println("The factorial of "+rem+" is : "+factorial);
      rem=0; 
      n=n/10;
    }
  }

 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter any value :=");
   int n=sc.nextInt();
   getFactorialDigit(n);
 }
}