package hometask;
public class Task1{
    public static void form(int n, char c){
        System.out.print("Integer is " +n+ " and character is " +c);
        System.out.print("\n");
    }
    public static void form(char c, int n){
        System.out.print("Character is " +c+ " and integer is " +n);
        System.out.print("\n");
    }
    public static void main(String args[]){
    form(1,'A');
    form('B',2);
    }   
}
