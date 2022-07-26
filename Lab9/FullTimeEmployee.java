package hometask;

class FullTimeEmployee extends Employee{  	 	
        
    FullTimeEmployee(String name, int age, String address, String department, String designation,double basic,double allowance) { 		
	super(name, age, address, department, designation); 		
                this.basic = basic; 		
                this.allowance = allowance; 	
    } 	 		
                 double basic, allowance;  		
        public double getBasic() { 		
                return basic; 	
        } 	
        public void setBasic(double basic) { 		
                this.basic = basic; 	
        } 	
        public double getAllowance() { 		
                 return allowance; 	
        } 	
        public void setAllowance(double allowance) { 		
                 this.allowance = allowance; 	
        } 	 	
                                                                
    @Override 	
        public String toString() { 		
                return "FullTimeEmployee [basic=" + basic + ", allowance=" + allowance + ", department=" + department+ ", designation=" + designation + ", name=" + name + ", age=" + age + ", address=" + address + "]"; 	
        } 	 	
                                                                    
        public double salary() { 		
                double sal = basic + (basic * (allowance/100)); 		
                return sal; 	
        }
} 