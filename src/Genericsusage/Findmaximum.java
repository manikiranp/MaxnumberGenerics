package Genericsusage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Findmaximum<T> {
	private static Scanner inp= new Scanner(System.in);
	private T[] inptarray;
	

	public static void main(String[] args) {
		Findmaximum method= new Findmaximum();
		System.out.println("Finding maximum from input using generics");
		Integer[] intarray= new Integer[3];
		Double[] doublearray= new Double[3];
		String[] stringarray=new String[3];
		System.out.println("Enter Three Integer Numbers:");
		for (int i=0;i<intarray.length;i++) {
			intarray[i]= inp.nextInt();
		}
		System.out.println("Enter Three Double Numbers:");
		for (int i=0;i<doublearray.length;i++) {
			doublearray[i]= inp.nextDouble();
		}
		System.out.println("Enter Three Strings:");
		for (int i=0;i<stringarray.length;i++) {
			stringarray[i]= inp.next();
		}
		
		method.Printmax(intarray);
		method.Printmax(doublearray);
		method.Printmax(stringarray);
			
		}
	
	public <T extends Comparable <T>>  T Printmax(T[] inptarray) {
		List<T> arrstream = Arrays.asList(inptarray);
		
		T maximum=arrstream.get(0) ;
		
		for (int i=1;i<arrstream.size();i++) {
		if(arrstream.get(i).compareTo(maximum) > 0) 
			maximum=arrstream.get(i);
		}
		System.out.println("maximum:"+maximum);
		return maximum;
		}
}

//
//		public double  Printmax(Double[] inptarray) {
//			List<Double> arrstream = Arrays.asList(inptarray);
//			Double maximum=arrstream.stream().max(Comparator.comparingDouble(Double::doubleValue)).orElse(null);
//			System.out.println("maximum Double number:"+maximum);
//			
//			return maximum;
//		
//	}
//		
//
//		public int  Printmax(Integer[] inptarray) {
//		List<Integer> arrstream = Arrays.asList(inptarray);
//		Integer maximum=arrstream.stream().max(Comparator.comparing(Integer::intValue)).orElse(null);
//		System.out.println("maximum number:"+maximum);
//		return maximum;
//
////		}
//		
//		
//
//}
