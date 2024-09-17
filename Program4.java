import java.util.Scanner;
class Program4
{
  public static void greaterFive(int n)
  {
     int count=0;
     while(n>0)
     {
       int rem=n%10;
       if(rem>5)
        {
          count++;
          System.out.println("Digits which are grater than 5 is:"+rem);
        }
       n=n/10;
     }
     if(count==0){
      System.out.println("No any digit which is grater than 5");
     }
  }

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any Number:=");
    int n=sc.nextInt();
    greaterFive(n);
  }
}