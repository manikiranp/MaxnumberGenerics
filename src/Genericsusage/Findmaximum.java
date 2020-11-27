package Genericsusage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class Findmaximum {
	private static Scanner inp= new Scanner(System.in);
	

	public static void main(String[] args) {
		Findmaximum method= new Findmaximum();
		System.out.println("Finding maximum from input using generics");
		Integer[] intarray= new Integer[3];
		Double[] doublearray= new Double[3];
		System.out.println("Enter Three Double Numbers:");
		for (int i=0;i<doublearray.length;i++) {
			doublearray[i]= inp.nextDouble();
		}
		System.out.println("Enter Three Integer Numbers:");
		for (int i=0;i<intarray.length;i++) {
			intarray[i]= inp.nextInt();
		}
		
		method.Printmax(intarray);
		method.Printmax(doublearray);
		
			
		}


		public double  Printmax(Double[] doublearray) {
			List<Double> arrstream = Arrays.asList(doublearray);
			Double maximum=arrstream.stream().max(Comparator.comparingDouble(Double::doubleValue)).orElse(null);
			System.out.println("maximum Double number:"+maximum);
			
			return maximum;
		
	}


		public int  Printmax(Integer[] intarray) {
		List<Integer> arrstream = Arrays.asList(intarray);
		Integer maximum=arrstream.stream().max(Comparator.comparing(Integer::intValue)).orElse(null);
		System.out.println("maximum number:"+maximum);
		return maximum;

		}
		
	

}
