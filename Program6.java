import java.util.Scanner;
class Program6
{
  public static void getBiggest(int n)
  {
    int big=0;
    while(n>0)
    {
      int i=n%10;
      if(i>big)
      {
         big=i;
      }
      n=n/10;
    }
    System.out.println("Biggest digit in no is:"+big);
  }

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any Value:=");
    int n=sc.nextInt();
    getBiggest(n);
    
  }
}