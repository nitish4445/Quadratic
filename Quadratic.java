//Input
//The first input line contains three integers a, b, c - the coefficients of the quadratic equations.
//The second line contains integer P

//Constraints:
//0 <= a, b, c, P <= 100
//Output
/*Print the value of f(P).*/
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Quadratic {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int x=sc.nextInt();
    System.out.println(a*x*x+b*x+c);
    }
}