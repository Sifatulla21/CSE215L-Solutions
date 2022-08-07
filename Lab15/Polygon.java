public abstract class Polygon

{

      private int numSide;

      //Define constructor

      public Polygon(int numSide)

      {

            setnumSide ( numSide);

      }

      //Define accessor method

      public int getnumSide ()

      {

            return numSide;

      }

      //Define mutator method

      public void setnumSide(int numSide)

      {

            this.numSide = numSide;

      }

      public abstract double area();

      public double perimeter(){

             return 0.0;

      }

}