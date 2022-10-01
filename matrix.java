import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class matrix {
    public static void main (String[] args) {
                      // Your code here
    Scanner sc=new Scanner(System.in);
    int N =sc.nextInt();
    int[][] num=new int[N][N];
    for(int i=0;i<N;i++)
    {
        for(int j=0;j<N;j++)
        {
            num[i][j]=sc.nextInt();
        }
    }
    for(int i=0; i<N;i++)
    {
        for(int j=0;j<N;j++){
            System.out.print(num[i][j]+" ");
        }
        System.out.println();
    }
    }
}