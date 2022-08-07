//Create a class which inherits from Polygon

public class Triangle extends Polygon{

      //Declare attributes

      double sideA,sideB,sideC;

      //Define constructor

      public Triangle(int numSide,double sideA,double sideB,double sideC){

      //Call super class constructor

      super(numSide);

      this.sideA=sideA;

      this.sideB=sideB;

      this.sideC=sideC;

      }

      //Define accessor method

      public double getSideA ()

      {

            return sideA;

      }

      public double getSideB ()

      {

            return sideB;

      }

      public double getSideC ()

      {

            return sideC;

      }

      @Override
      public double perimeter()

      {

            return (sideA+sideB+sideC);

      }

      //Define mutator methods

      public void setSideA(double sideA)

      {

            this.sideA=sideA;

      }

      public void setSideB(double sideB)

      {

            this.sideB=sideB;

      }

      public void setSideC(double sideC)

      {

            this.sideC=sideC;

      }

      //Define area()

      @Override
      public double area()

      {

            double s = perimeter()/2;

            

            return Math.sqrt(s*(s- sideA)*(s- sideB)*(s - sideC));

      }

}