/**
 * @(#)InsertionSort2.java
 *
 *
 * @author 
 * @version 1.00 2015/2/6
 */


public class InsertionSort2 
{
	public static void insertionSortPart2(int[] ar)
   	{       
  		for (int i = 1; i < ar.length; i++) 
  		{
 			int next = ar[i];
   			int j = i;
   			while (j > 0 && ar[j - 1] > next) 
   			{
   				ar[j] = ar[j - 1];
                j--;
            }

            
            ar[j] = next;
               
     		printArray(ar);
        }
    }    
      
    public static void main(String[] args) 
   	{
		Scanner in = new Scanner(System.in);
   	 	int s = in.nextInt();
       	int[] ar = new int[s];
       	
       	for(int i=0;i<s;i++)
    	{
   			ar[i]=in.nextInt(); 
       	}
       
       	insertionSortPart2(ar);    
   	}
   	
   	    
    private static void printArray(int[] ar) 
  	{
 		for(int n: ar)
 		{
         	System.out.print(n+" ");
      	}
      	
        System.out.println("");
   }   
}