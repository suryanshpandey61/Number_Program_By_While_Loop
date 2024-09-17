import java.util.Scanner;
class Program1{
  public static void printNo(int n)
  {
     while(n>0){
        int rem=n%10;
        System.out.println(rem);
        n=n/10;
     }
  }
 
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any Number:=");
    int n=sc.nextInt();
    printNo(n);
  }

}