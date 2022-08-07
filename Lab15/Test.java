import java.util.Scanner;

//Create a Tester class

public class Test {

      public static void main(String[] args) {

            double sideA,sideB,sideC;

            Scanner s =new Scanner(System.in);

            System.out.print("Enter sideA: ");

            sideA=s.nextDouble();

            System.out.print("Enter sideB: ");

            sideB=s.nextDouble();

            System.out.print("Enter sideC: ");

            sideC=s.nextDouble();

            if((sideB+sideC)>sideA){

                  //Create an object for Triangle class
                  Polygon p;
                  p = new Triangle(3,sideA,sideB,sideC);

                  //    Call the method to display the result

                  System.out.println("\nPerimeter: "+p.perimeter()+"\nArea: "+p.area());

            }

            else

                  System.out.println("Invalid sides for Triangle");

      }

}