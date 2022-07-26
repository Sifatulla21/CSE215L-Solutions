package hometask;

class PartTimeEmployee extends Employee{ 	 	
    PartTimeEmployee(String name, int age, String address, String department, String designation,double hours,double rate) { 		
        		
        super(name, age, address, department, designation); 		
        this.hours = hours; 		
        this.rate = rate; 	
    } 	 		
        double hours, rate; 		 
        public double getHours() { 		
            return hours; 	
        } 
        public void setHours(double hours) { 		
            this.hours = hours; 	
        } 	
        public double getRate() { 		
            return rate; 	
        } 	
        public void setRate(double rate) { 		
            this.rate = rate; 	
        } 	 	
                            
    @Override
        public String toString() { 		
            return "PartTimeEmployee [hours=" + hours + ", rate=" + rate + ", department=" + department + ", designation=" + designation + ", name=" + name + ", age=" + age + ", address=" + address + "]"; 	
        } 	 	
                                   	
        public double salary() { 		
                      double sal = hours*rate; 		
                      return sal; 	
        } 
} 