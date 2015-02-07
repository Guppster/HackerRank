/**
 * @(#)Solution.java
 *
 *
 * @author Gurpreet Singh
 * @version 1.00 2015/2/6
 */

import java.util.*;

public class InsertionSort1
{
	static void insertionSort(int[] ar) 
	{
		int last;
		int j;
       	int inserted = 0;
       	
        last = ar[ar.length-1];
 
              
       	for (j = ar.length-2; j > -1; j--)
       	{
        	if (ar[j] > last)
        	{
       			ar[j+1] = ar[j];
              	printArray(ar);
         	} 
         	else if (ar[j] <= last)
         	{
          		ar[j+1] = last;
           		inserted = 1;
              	break;
            }  
      	}
 
                
     	if(inserted == 0)
     	{
           ar[0] = last;
      	}
               
     	printArray(ar);    
 	}  
 		
 	static void printArray(int[] ar) 
 	{
    	for(int n: ar)
    	{
      		System.out.print(n+" ");
        }
        
      	System.out.println("");
  	}
	
	
    public static void main(String[] args) 
    {
   		Scanner in = new Scanner(System.in);
       	int n = in.nextInt();
       	int[] ar = new int[n];
        for(int i=0;i<n;i++)
        {
        	ar[i]=in.nextInt();
      	}
      	insertionSort(ar);
      	
  	}   
}