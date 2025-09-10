package com.codegnan.arrays;
public class freqCount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		int [] array= {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1};
		//boolean[]processed=new boolean [array.length];
		for(int i=0;i<array.length;i++) {
			//if the element index i has already been processed skip it.
			//if(processed[]) {
				//continue;
			//}
			int count=1;
			//to compare the compare the current element with rest of elements.
			for(int j=i+1;j<array.length;j++) {
				if(array[j]==array[i]) {
					count++;
					//processed[j]=true;
				}
			}
			System.out.println(array[i]+" occurs "+count+" times");
		}
	}

}
