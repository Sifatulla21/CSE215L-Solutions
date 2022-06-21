package hometask;
import java.util.Scanner;
public class cgpaCalculator
{
        int marks[] = new int[3];
        int i;
        float total=0, avg;
        
 void calculator(){
	Scanner s = new Scanner(System.in);
        for(i=0; i<3; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+": ");
           marks[i] = s.nextInt();
           total = total + marks[i];
        }
        avg = total/3;
        System.out.print("The Grade is:");
        if(avg>=91 && avg<=100)
        {
            System.out.print("A");
        }
        else if(avg>=81 && avg<=90)
        {
           System.out.print("B+");
        } 
        else if(avg>=71 && avg<=80)
        {
            System.out.print("B");
        }
        else if(avg>=61 && avg<=70)
        {
            System.out.print("C");
        }
        else if(avg>=51 && avg<=60)
        {
            System.out.print("D");
        }
        else if(avg<=40)
        {
            System.out.print("Fail");
        }
        else
        {
            System.out.print("Wrong Input");
        }
    }
}