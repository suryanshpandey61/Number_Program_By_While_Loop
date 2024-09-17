import java.util.Scanner;
class Program15
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
    int k=n;
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
  
   if(sum==k)
   {
     System.out.println(k+" Is a Strong Number");
   }
  else
  {
     System.out.println(k+ " Not an Strong Number");
  }
 }

 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter any value : ");
   int n=sc.nextInt();
   getSumOfFact(n);
 }
}