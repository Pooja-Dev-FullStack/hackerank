package com.intv.ques;


public class BufferVsBuilder {

	public static void main(String[] args) {
		long startTime= System.currentTimeMillis();
		System.out.println(startTime);
		StringBuffer sBuffer = new StringBuffer("thread-safe");
		for(int i=0;i<1000;i++) {
			sBuffer.append("jk");
		}
		long endTime1 = System.currentTimeMillis() - startTime;
		
		startTime = System.currentTimeMillis();
		System.out.println(startTime);
		StringBuilder sBuilder = new StringBuilder("not thread-safe");
		for(int i=0;i<1000;i++) {
			sBuilder.append("jk");
			
		}
		
		long endTime2 = System.currentTimeMillis() - startTime;

		System.out.println("StringBuffer "+ endTime1 +" StringBuilder "+ endTime2);
	}

}
