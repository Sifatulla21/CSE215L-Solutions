//ThresholdDiscount class 
public class ThresholdDiscount implements Discountable{ 	 	
    //variables 	
    private double threshold, discount; 
     	//constructor 	
    public ThresholdDiscount(double threshold, double discount) { 
		this.threshold = threshold;
 		this.discount = discount; 
	}  	 	
    //getter and setter 	 	
    public double getThreshold() { 		
        return threshold; 	
    }  	
    public void setThreshold(double threshold) { 		
        this.threshold = threshold; 	
    }  	
    public double getDiscount() { 		
        return discount; 	
    }  	
    public void setDiscount(double discount) { 		
        this.discount = discount; 	
    }  	
    //method to get discounted price 	
    @Override 	
    public double discountedPrice(double price) { 		 		
        //if price is more than threshold 		
        if(price > threshold) 
        { 			
            return price - price * (discount / 100); 		
        } 		 		
        return price; 	
        } 	 	  
} 
 