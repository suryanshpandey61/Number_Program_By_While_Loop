import java.util.Scanner;
class Program11 
{
  public static void getSumOfDigit(int n)
  {
    int sum=0;
    while(n>0)
    {
      int rem=n%10;
      sum=sum+rem;
      n=n/10;
    }
    System.out.println("Sum of all digits is: "+sum);
  }
 
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter any value:= ");
   int n=sc.nextInt();
   getSumOfDigit(n);

 }
}