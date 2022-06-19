import java.util.Scanner;
public class Task1{
public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int students = 3;
    String[] name = new String[students];
    int[] id = new int[students];
    int[] section = new int[students];
    double[] CGPA = new double[students];
    String[] gender = new String[students];

        for (int i = 0; i < students; i++) 
        {
         System.out.println("\nPlease Enter Information of Student:" + (i+1));

            System.out.println("Enter Name:");
            name[i] = s.nextLine();

            System.out.println("Enter ID:");
            id[i] = s.nextInt();

            s.nextLine();

            System.out.println("Enter Section:");
            section[i] = s.nextInt();

            System.out.println("Enter CGPA:");
            CGPA[i] = s.nextDouble();

            s.nextLine();

            System.out.println("Enter Gender:");
            gender[i] = s.nextLine();
        }   

System.out.println("\nFemale students with Name Length 4 -");
        for(int i = 0; i < students; i++)
        {
            if(gender[i].equals("female") && name[i].length() == 4)
            {
                System.out.println("Id:" + id[i]);
                System.out.println("Section:" + section[i]);
            }
        }

System.out.println("\nMale students with Name starting with 'S' -");
    for(int i = 0; i < students; i++)
        {
            if(gender[i].equals("male") && name[0].charAt(0) == 'S')
                {
                    System.out.println("Name:" + name[i]);
                    System.out.println("CGPA:" + CGPA[i]);
                }
        }
    }
}
