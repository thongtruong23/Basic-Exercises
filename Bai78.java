package baitap;

import java.util.Arrays;

public class Bai78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int[] array_nums = {5, 7};
		System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		if(array_nums[0] == 4 || array_nums[0] == 7)
			System.out.println("True");
		else
	    System.out.println(array_nums[1] == 4 || array_nums[1] == 7);

	}

}
