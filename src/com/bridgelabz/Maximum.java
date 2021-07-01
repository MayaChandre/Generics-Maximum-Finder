package com.bridgelabz;

public class Maximum  <T extends Comparable<T>> {

	T num1;
	T num2;
	T num3;
	
	 public static void main(String[] args) {
   	  System.out.println("Maximum Integer by creating Generic class :" + new Maximum(2, 4, 6).GenericMax());
   	  System.out.println("Maximum Float by creating Generic class :" + new Maximum(3.4f, 4.6f, 6.7f).GenericMax());
   	  System.out.println("Maximum string by creating Generic class :" + new Maximum("apple","banana","orange").GenericMax());
   }
	
    public Maximum(T num1, T num2, T num3) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}


    public T GenericMax() {
    	return Maximum.GenericMax(num1, num2, num3);
    }
    public static <T extends Comparable<T>> T GenericMax(T num1, T num2, T num3) {
        T max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }

}