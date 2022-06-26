package hometask;
import java.util.Scanner;
public class Students{
public static int n;
public static void studentInfo(String name[], int id[], double cgpa[])
 {
double sum=0,average;
for(int i=0;i<n;i++)
 {
     System.out.printf("\n  Name of Student "  +(i+1)+ " = " +name[i]);
     System.out.printf("\n");
     System.out.printf("\n  ID of Student" +(i+1)+ " = " +id[i]);
     System.out.printf("\n");
     System.out.printf("\n  CGPA of Student "+(i+1)+ " = " +cgpa[i]);
     System.out.printf("\n");
     sum=sum+cgpa[i];
  }
    average = sum/n;

    System.out.printf("\n     Sum of CGPA = "+sum);
    System.out.printf("\n");
    System.out.printf("\n     Average of CGPA = "+average);
    System.out.printf("\n");
}


public static void studentInfo(String name[], int marks[])
 {
   int i,mark=0,top=0;
   for(i=0;i<n;i++)
   {
     if(mark<marks[i])
     {
         mark=marks[i];
         top=i;
     }
   }
  
   System.out.println("\nTop Scorer's Information: ");
   System.out.printf("\n    Name : " +name[top]+ "\n");
   System.out.printf("\n    Mark : " +marks[top]+ "\n");
}

public static void main(String[] args){
    int i;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter number of students : ");
    n = s.nextInt();
//declare array's with n number of size
    String [] name = new String[n];
    int [] id = new int[n];
    double [] cgpa = new double[n];
    int [] marks = new int[n];
    for(i=0;i<n;i++)
    {
      s.nextLine();
      System.out.print("\nEnter the name of student " +(i+1)+ " : ");
      name[i] = s.nextLine();
      System.out.print("\nEnter the id of student " +(i+1)+ " : ");
      id[i] = s.nextInt();

      System.out.print("\nEnter the Marks of student " +(i+1)+ " : ");
      marks[i]=s.nextInt();

      System.out.print("\nEnter the CGPA of student " +(i+1)+ " : ");
      cgpa[i]=s.nextDouble();

    }
 studentInfo(name,id,cgpa);
 studentInfo(name,marks);
 }
 }