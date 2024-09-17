import java.util.Scanner;
class Program9
{
  public static void getDifference(int n)
  {
    int big=0;
    int small=9;
    while(n>0)
    {
       int rem=n%10;
       if(big<rem)
       {
          big=rem;
          
       }
       if(small>rem)
         {
           small=rem;
         }
      n=n/10;
    }
     int diff=big-small;
    System.out.println("Diffrence in Biggest and smallest is : "+diff);
  }

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any value:=");
    int n=sc.nextInt();
    getDifference(n);
  }
}