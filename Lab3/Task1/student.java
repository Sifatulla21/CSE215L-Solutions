
package hometask;
import java.util.*;
// Class definition
public class student {
// Attributes to hold values
String full_name;
double marks;
double cgpa;
// Constructor to feed values into object
student(){
Scanner sc = new Scanner(System.in);
System.out.print("\nEnter name = ");
this.full_name = sc.nextLine();
System.out.print("Enter marks = ");
this.marks = sc.nextDouble();
System.out.print("Enter CGPA = ");
this.cgpa = sc.nextDouble();
}
}
