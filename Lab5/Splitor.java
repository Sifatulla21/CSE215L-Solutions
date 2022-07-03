import java.util.Arrays;
 
class Splitor
{
    // Method to split an array into two parts in Java
    public static void main(String[] args)
    {
        int[] inp = { 5,8,9,12,2};
        int n = inp.length;
 
        int[] a = new int[(n + 1)/2];
        int[] b = new int[n - a.length];
 
        for (int i = 0; i < n; i++)
        {
            if (i < a.length) {
                a[i] = inp[i];
            }
            else {
                b[i - a.length] = inp[i];
            }
        }
        System.out.println("Initial Array: " +Arrays.toString(inp));
        System.out.println("Array 1: " +Arrays.toString(a));
        System.out.println("Array 2: " +Arrays.toString(b));
        
    }
}