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
		System.out.println("Enter Three Numbers:");
		for (int i=0;i<intarray.length;i++) {
		intarray[i]= inp.nextInt(); 
		}
		
		method.Printmax(intarray);
		
			
		}


		public int  Printmax(Integer[] intarray) {
		List<Integer> intstream = Arrays.asList(intarray);

		Integer maximum=intstream.stream().max(Comparator.comparing(Integer::intValue)).orElse(null);
		System.out.println("maximum number:"+maximum);
		return maximum;

		}
		
	

}
