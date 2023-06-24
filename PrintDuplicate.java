package week1.day2;

import java.util.Iterator;

public class PrintDuplicate {

	public static void main(String[] args) {
		int[] nums= {15,12,14,12,13,11,13};
		for (int i = 0; i < nums.length; i++) {
			
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					System.out.println(nums[i]);
					
				}
			}
			
		}

	}

}
