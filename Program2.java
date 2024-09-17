import java.util.Scanner;
class Program2{
  public static void getEven(int n){
     while(n>0){
       int rem=n%10;
       if(rem%2==0){
         System.out.println("Even digits in giver number is:"+rem);
       }
       n=n/10;
     }

  }
 
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter any Number:=");
    int n=sc.nextInt();
    getEven(n);
 }

}