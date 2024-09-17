import java.util.Scanner;
class Program16
{
  public static void getReverse(int n)
  {
    int rev=0;
    int k=n;
    while(n>0)
    {
      int rem=n%10;
      rev=rev*10+rem;
      rem=0;
      n=n/10;
    }
   System.out.println("The Reverse of "+k+" is: "+rev);
  }
  
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter any value: ");
   int n=sc.nextInt();
   getReverse(n);
 }

}