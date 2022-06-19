import java.util.Scanner;
public class Task2{
   public static void main(String args[]){
      int num1, num2, i,min, gcd=1, hcf = 0;
      Scanner s = new Scanner(System.in);
      System.out.println("Enter first number: ");
      num1 = s.nextInt();
      System.out.println("Enter second number: ");
      num2 = s.nextInt();
      min = (num1<num2)?num1:num2;
   for(i=1;i<=min;i++)
   {
      if(num1%i==0 && num2%i==0)
      {
         gcd = i;
      }
   }
      System.out.println("G.C.D of "+num1+" and "+num2+" is: "+gcd);

   for(i = 1; i <= num1 || i <= num2; i++) 
   {
      if( num1%i == 0 && num2%i == 0 )
      {
         hcf = i;
      }
         
   }
      System.out.println("HCF of "+num1+" and "+num2+" is:"+hcf);
   }
}