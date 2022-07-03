
import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        System.out.print("Enter a number: "); // TAKING INPUT FROM USER
        Scanner sc= new Scanner(System.in);  
        int n= sc.nextInt(); 
        // Fibonacci SERIES PRINTING
        int n1 = 0, n2 = 1;
        int c;
        System.out.print("First " + n + " Fibonacci numbers: ");
        System.out.print(n1+ " " +n2);
        for(int i =3; i<=n; i++){
            c = n1 +n2;
            System.out.print(" " +c);  
            n1 = n2; 
            n2 = c;
        }
        System.out.println("\n");
    }
}