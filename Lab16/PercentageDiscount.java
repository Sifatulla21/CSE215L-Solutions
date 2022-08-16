 //PercentageDiscount class 
 public class PercentageDiscount implements Discountable{  
     	//variable 
     private double percentage;
       	//constructor 	
     public PercentageDiscount(double percentage) { 		
         this.percentage = percentage; 	
     }  
     //getter and setter 	 
     public double getPercentage() { 
         	return percentage; 	
             }  	
    public void setPercentage(double percentage) { 	
        	this.percentage = percentage; 
	}  
    	//method to get discounted price 	
        @Override 	public double discountedPrice(double price) { 		
            return price - price * (percentage / 100); 	
        } 	
 } 
 

 