import java.util.Scanner;
class Program5
{
  public static void getCount(int n)
  {
    int count=0;
    while(n>0)
    {
      count++;
      n=n/10;
    }
    System.out.println("Total digits in no:"+count);
  }

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any no:=");
    int n=sc.nextInt();
    getCount(n);
  }
}