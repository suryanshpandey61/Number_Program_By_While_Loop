import java.util.Scanner;
class Plaindrome
{
  public static void checkPlaindrome(int n)
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
   if(rev==k)
   {
     System.out.println(k+" Is a Plaindrome Number");
   }
   else
   {
     System.out.println(k+" Not a Plaindrome Number");
   }
    
  }
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter any value:");
   int n=sc.nextInt();
   checkPlaindrome(n);
 } 
}