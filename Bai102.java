package baitap;

public class Bai102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] array_nums = {11, 11, 13, 31, 45, 20, 33, 53};
    int result = 1; 
	System.out.println("Original Array: "+Arrays.toString(array_nums)); 
	
	for(int i = 0; i < array_nums.length; i++)
     {
      	if(array_nums[i] == 10 || array_nums[i] == 30)
		{	
  		
		   result =0;
		}
      }
	 if (result==0)
 	   System.out.printf( String.valueOf(true));	         
     else
	   System.out.printf(String.valueOf(false));

	}

}
