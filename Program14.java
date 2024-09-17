import java.util.Scanner;
class Program14
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

 public static void getSumOfFact(int n)
 {
    
    int sum=0;
    while(n>0)
    {
      int rem=n%10;
      int a=getFactorial(rem);
      sum=sum+a;
      a=0;
      n=n/10;
    }
   System.out.println("Sum of all Factorial of digits: "+sum);
  
  
 }

 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter any value : ");
   int n=sc.nextInt();
   getSumOfFact(n);
 }
}