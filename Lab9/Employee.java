package hometask;

public class Employee extends Person{ 	 	
        	
       Employee(String name, int age, String address,String department,String designation) { 				
           
           super(name, age, address); 		
           this.department = department; 		
           this.designation = designation; 	
       } 	 		
           String department, designation; 	 		
           public String getDepartment() { 		
               return department; 	
           } 	
            public void setDepartment(String department) { 		
                this.department = department; 	
            } 	
            public String getDesignation() { 		
                return designation; 	
            } 	
            public void setDesignation(String designation) { 		
                this.designation = designation; 	
            } 
}  