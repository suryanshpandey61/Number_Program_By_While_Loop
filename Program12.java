import java.util.Scanner;
class Program12
{
  public static void getSumOfEven(int n)
  {
    int sum=0;
    while(n>0)
    {
      int rem=n%10;
      if(rem%2==0)
       {
         sum=sum+rem;
       }
      n=n/10;
    }
   System.out.println("Sum of all even digits are: "+sum);
  }

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any value:= ");
    int n=sc.nextInt();
    getSumOfEven(n);
  }
}