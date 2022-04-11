package com.greatlearning.services;

public class Denomination {

	public static void sortDenomination(int[] array, int left, int right) {
		
		if(left<right) {
			
			int mid=(left+right)/2;

			sortDenomination(array,left,mid);
			sortDenomination(array,mid+1,right);
			mergeArray(array,left,mid,right);
			
				
			}
			
		}
		// TODO Auto-generated method stub

	private static void mergeArray(int[] array, int left, int mid, int right) {
		
		int l1=mid-left+1;
		int l2= right-mid;
		// TODO Auto-generated method stub
		
	}
		
	}

}
