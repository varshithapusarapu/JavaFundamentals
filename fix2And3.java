package com.codegnan.arrays;


public class fix2And3 {
//access modifier return type method name (Arguments);
	public static int[] fix23(int[] nums){
		if(nums[0]==2&&nums[1]==3) {
			nums[1]=0;
			
		}if(nums[1]==2&&nums[2]==3) {
			nums[2]=0;
		}
		return nums;
	}
	public static void printArray(int [] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(",");
		}
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr1= {1,2,3};
//		int [] arr2= {2,3,4};
//		int [] arr3= {1,2,2};
		
//		//System.out.println(Arrays.toString(fix23(arr1)));
//		printArray(fix23(arr1));
//		printArray(fix23(arr2));
//		printArray(fix23(arr3));
		int [][] testcases= {{1,2,3},{2,3,4},{4,2,3},{1,4,2}};
		for(int i=0;i<testcases.length;i++) {
			int [] result=fix23(testcases[i]);
			System.out.print("testcase :"+(i+1)+" ");
			printArray(result);
		}
				
		}
		
		

	}


