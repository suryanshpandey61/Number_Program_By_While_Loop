import java.util.Scanner;
class Program3{
  public static void printOdd(int n){
     while(n>0){
       int rem=n%10;
       if(rem%2!=0){
         System.out.println("Odd digits in no:"+rem);
       }
       n=n/10;
     }
   }
  
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter any number:=");
   int n=sc.nextInt();
   printOdd(n);
   
 }

}