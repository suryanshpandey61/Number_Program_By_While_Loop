import java.util.Scanner;
class Program7
{
  public static void countEven(int n)
  {
    int count=0;
    while(n>0)
    {
      int rem=n%10;
      if(rem%2==0)
       {
        count++;
        
       }
      n=n/10;
    } 
    System.out.println("Total No Even digits is:"+count);
  }

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any value:=");
    int n=sc.nextInt();
    countEven(n);
  }
}
