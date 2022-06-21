package hometask;
import hometask.student;
public class calculate {
    static void allSum(student[] arr, int n) {
        double sum_marks =0 , sum_cgpa = 0;
        for(int i =1;i<=n;i++) {
            sum_marks = sum_marks + arr[i].marks;
            sum_cgpa = sum_cgpa + arr[i].cgpa;
        }
        System.out.println("\nSum of All marks = "+ sum_marks);
        System.out.println("Sum of All cgpa = "+ sum_cgpa);
    }

    static double[] allAverage(student[] arr, int n) {
        double sum_marks =0 , sum_cgpa = 0;
        for(int i =1;i<=n;i++) {
            sum_marks = sum_marks + arr[i].marks;
            sum_cgpa = sum_cgpa + arr[i].cgpa;
        }
        //Creating an array to return the value
        double return_arr[] = new double[2];
        return_arr[0] = sum_marks/n;
        return_arr[1] = sum_cgpa/n;
        return return_arr;
    }

    static int[] evenSum(student[] arr, int n) {
        double sum_marks =0;
        for(int i =2;i<=n;i=i+2) {
            sum_marks = sum_marks + arr[i].marks;
        }
        // Converting the double values to int type
        int sum_marks_int = (int) sum_marks;
        int sum_marks_avg = (int) sum_marks/n;
        // Creating the return array
        int return_arr[] = new int[2];
        return_arr[0] = sum_marks_int;
        return_arr[1] = sum_marks_avg;
        return return_arr;
    }

    static double[] oddSum(student[] arr, int n) {
        double sum_marks =0 ;

        for(int i =1;i<=n;i=i+2) {
            sum_marks = sum_marks + arr[i].marks;
        }
        //Creating return array to hold both answers
        double return_arr[] = new double[2];
        return_arr[0] = sum_marks;
        return_arr[1] = sum_marks/n;

        return return_arr;
    }

    public static void main(String[] args) {
// Creating an object array to hold the details of 8 students
        student[] obj_arr = new student[8];
        obj_arr[1] = new student();
        obj_arr[2] = new student();
        obj_arr[3] = new student();
        obj_arr[4] = new student();
        obj_arr[5] = new student();
        obj_arr[6] = new student();
        obj_arr[7] = new student();
        obj_arr[8] = new student();
        // Creating arrays to hold the answers returned by methods
        double ansfromallAverage[] = new double[2];
        int ansfromevenSum[] = new int[2];
        double ansfromOddSum[] = new double[2];
        // Calling allAverage() method on object array created
        ansfromallAverage = allAverage(obj_arr, 8);
        // Calling evenSum() method on object array created
        ansfromevenSum = evenSum(obj_arr, 8);
        // Calling Oddsum() method on object array created
        ansfromOddSum = oddSum(obj_arr,8);
        //Displaying out the results from methods stored in respective arrays
        System.out.println("The Results from the methods are :");
        // Calling allsum() method on object array created
        allSum(obj_arr, 8);
        System.out.println("\nAverage of All Marks = "+ansfromallAverage[0]);
        System.out.println("Average of All CGPA = "+ansfromallAverage[1]);
        System.out.println("\nSum of Even Marks = "+ansfromevenSum[0]);
        System.out.println("Average of Even Marks = "+ansfromevenSum[1]);
        System.out.println("\nSum of Odd Marks = "+ansfromOddSum[0]);
        System.out.println("Average of Odd Marks = "+ansfromOddSum[1]);
        }
}
      
