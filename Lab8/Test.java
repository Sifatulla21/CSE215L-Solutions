package hometask;


class Test{  
        public static void main(String[] args){     
               Employee e1 = new Employee("MR A", 2018,50000);     
               Employee e2 = new Employee("MR B", 2019,60000);    
               Employee e3 = new Employee("MR C", 2020,70000);         
               System.out.println("Name Of Employee 1: " +e1.getName()+ "\tJoining Year Of Employee 1: " +e1.getYear()+"\tSalary Of Employee 1: " +e1.getSalary());       
               System.out.println("Name Of Employee 2: " +e2.getName()+ "\tJoining Year Of Employee 2: " +e2.getYear()+"\tSalary Of Employee 2: " +e2.getSalary());         
               System.out.println("Name Of Employee 3: " +e3.getName()+ "\tJoining Year Of Employee 3: " +e3.getYear()+"\tSalary Of Employee 3: " +e3.getSalary());     
 }
}