package hometask;



public class Main {  	
    public static void main(String[] args) { 		
       	
        PartTimeEmployee partTimeEmp = new PartTimeEmployee("MR A", 27, "Dhaka", "WebDev", "MERN Developer", 200, 300); 		//Creating FullTimeEmployee Object with Details 		
        FullTimeEmployee fullTimeEmp = new FullTimeEmployee("MR B", 35, "Dhaka", "WebDev", "MERN Developer", 15000, 25); 		 		
        //Printing Salary of PartTime and FullTime Employee 		
        System.out.println("Part Time Employee Salary: "+partTimeEmp.salary()); 		
        System.out.println("Full Time Employee Salary: "+fullTimeEmp.salary());  	}  } 