import java.io.*;
import java.util.*;

public class CorrectnessAndTheLoopInvariant {

    public static void insertionSort(int[] A)
    {
        for(int i = 1; i < A.length; i++)
        {
            int value = A[i];
            int j = i;
            while(j > 0 && A[j -1] > value)
            {
                A[j] = A[j - 1];
                j--;
            }
              A[j] = value;
        }
      
        printArray(A);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}