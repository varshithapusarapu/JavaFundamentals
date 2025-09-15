package com.codegnan.oopExamples;
public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box mybox1=new Box(2.0,6.0,7.0);
//		mybox1.height=1.0;
//		mybox1.depth=3.0;
//		mybox1.width=4.0;
		double vol,vol2;
		mybox1=null;
		//vol=mybox1.height*mybox1.width*mybox1.depth;
		//System.out.println(vol);
		Box mybox2=new Box(3.0,4.0,9.0);
		vol2=mybox2.height*mybox2.width*mybox2.depth;
		System.out.println(vol2);

	}

}
