 import java.util.Scanner;  
 //test class 
 public class Test { 	 	
     //main method 	
     public static void main(String[] args) { 		 		
         //Scanner to take user input 		
        Scanner sc = new Scanner(System.in); 		 		
         //get price and discount from user 
         System.out.println("Enter Price: ");
        double price = sc.nextDouble(); 
        System.out.println("Enter Discount: ");
        double discount = sc.nextDouble(); 		 		
        System.out.println("Enter Treshold: ");
        double treshold = sc.nextDouble(); 		 		
        //create objects 		
        PercentageDiscount pd = new PercentageDiscount(discount); 		
        ThresholdDiscount td = new ThresholdDiscount(treshold, discount); 		 		
        //call discountedPrice method 		
        System.out.println("Percent Discount: "+pd.discountedPrice(price)); 		
        System.out.println("Treshold Discount: "+td.discountedPrice(price)); 		 	
    }  
} 
 

 

