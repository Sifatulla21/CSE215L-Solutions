public class Fraction {      
    private int numerator;
    private int denominator;     
public Fraction(int numerator, int denominator) {       
    this.numerator = numerator;         
    this.denominator = denominator;     
    }     
    public int getNumerator() {         
        return numerator;     
    }
    
    public void setNumerator(int numerator) {         
        this.numerator = numerator;     
    }      
    public int getDenominator() {         
        return denominator;     
    }      
    public void setDenominator(int denominator) {         
        this.denominator = denominator;     
    }          
    public String toString() {        
        return ""+numerator+"/"+denominator;     
    }      //add method to add another fraction and store the result in calling fraction     
    public void add(Fraction fraction) {          //logic for addition         
        int num = this.getNumerator()*fraction.getDenominator()+this.getDenominator()*fraction.getNumerator();         
        int deno = this.getDenominator()*fraction.getDenominator();          
        this.setNumerator(num);//setting new numerator to current object         
        this.setDenominator(deno);//setting denominator to current object     
    }      //subraction method to subract another fraction and store the result in calling function     
    public void sub(Fraction fraction) {          //logic for subraction        
        int num = this.getNumerator()*fraction.getDenominator()-this.getDenominator()*fraction.getNumerator();         
        int deno = this.getDenominator()*fraction.getDenominator();          
        this.setNumerator(num);//setting new numerator to current object         
        this.setDenominator(deno);//setting denominator to current object     
    }      //multiplication method to multiply another fraction and result store in calling fraction     
    public void multiplication(Fraction fraction) {          
                              //logic for multiplication         
        int num = this.getNumerator()*fraction.getNumerator();         
        int deno = this.getDenominator()*fraction.getDenominator();          
        this.setNumerator(num);//setting new numerator to current object         
        this.setDenominator(deno);//setting denominator to current object     
    }      //division method to divide another fraction and result store in calling fraction     
    public void division(Fraction fraction) {          //logic for division         
        int num = this.getNumerator()*fraction.getDenominator();         
        int deno = this.getDenominator()*fraction.getNumerator();          
        this.setNumerator(num);//setting new numerator to current object         
         this.setDenominator(deno);//setting denominator to current object     
                              
  } 

} 