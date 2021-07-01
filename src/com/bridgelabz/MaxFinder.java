package com.bridgelabz;
import java.util.Comparator;
import java.util.Scanner;

	public class MaxFinder <T extends Comparable> {
		private T[] inputArray;

		
	    public MaxFinder(T[] inputArray) {
	        this.inputArray=inputArray;
	    }

	     private static <T extends Comparable> void getMax(T[] array){
	        T max = array[0];
	        for (int i=0;i<array.length; i++){
	            if (array[i].compareTo(max)>0){
	                max=array[i];
	            }
	        }
	        MaxFinder.printMax(max);

	    }
	    private static<T> void printMax(T max)
	    {
	        System.out.println("Maximum : "+max);
	    }
	    
	    
	    public static void main(String[] args)
	    {
	        
	    	Integer[] intArray={10,9,8,7,6,5,56};
	        Double[] doubleArray={3.3,6.67,4.56,89.43};
	        String[] stringArray={"a","abc","mno","xyz"};
	        
	        System.out.println("maximum of integer [10,9,8,7,6,5,56] values are");
	        MaxFinder.getMax(intArray);
	        
	        System.out.println("maximum of Float [3.3,6.67,4.56,89.43] values are");
	        MaxFinder.getMax(doubleArray);
	        
	        System.out.println("maximum of String [ a,abc,mno,xyz ] values are");
	        MaxFinder.getMax(stringArray);
	    }
	    }
	
