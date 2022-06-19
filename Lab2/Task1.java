import java.util.*;

class Task1{
public static void main(String[] args) {
    int choice = 1,  sum = 0, product = 1, count = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number(0 to quit):");
while(choice != 0){
    choice = s.nextInt();

    if(choice != 0){
        int number = choice;
        sum = sum+number;
        product = product*number;
        count++;
    }
} 

    System.out.println("Product is: "+product+"\nAverage is: "+((float)sum/count));

    }
}