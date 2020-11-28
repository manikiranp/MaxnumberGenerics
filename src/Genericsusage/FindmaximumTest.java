package Genericsusage;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class FindmaximumTest {
	Findmaximum validation = new Findmaximum();

	@Test
	public  void Printmax_at_firstposition() {
		Integer[] intarray= {966,84,90};
		Assert.assertEquals(966, validation.Printmax(intarray));
	}
	@Test
	public  void Printmax_at_secondposition() {	
		Integer[] intarray= {121,1323,90};
		Assert.assertEquals(1323, validation.Printmax(intarray));
		
	}	
	@Test
	public  void Printmax_at_thirdposition() {
		
		Integer[] intarray= {922,629,982};
		Assert.assertEquals(982, validation.Printmax(intarray));		
	}

//	@Test
//	public  void Printmax_at_firstposition_double() {
//		Double[] doublearray= {922.3222,62.9,9.82};
//		assertEquals(922.3222, validation.Printmax(doublearray));
//	}
//	
//	@Test
//	public   void Printmax_at_secondposition_double() {
//		Double[] doublearray= {92.3,622.9,9.82};
//		Assert.assertEquals(622.9, validation.Printmax(doublearray));
//	}
//	@Test
//	public  void Printmax_at_thirdposition_double() {
//		Double[] doublearray= {92.3,62.9,982.9};
//		Assert.assertEquals(982.9, validation.Printmax(doublearray));
//	}
	@Test
	public  void Printmax_at_firstposition_string() {
		String[] stringarray= {"scdc","aaa","dcd"};
		Assert.assertEquals("scdc", validation.Printmax(stringarray));
	}
	@Test
	public  void Printmax_at_secondposition_string() {
		String[] stringarray= {"scdc","taa","dcd"};
		Assert.assertEquals("taa", validation.Printmax(stringarray));
	}
	@Test
	public  void Printmax_at_thirdposition_string() {
		String[] stringarray= {"acdc","taa","zcd"};
		Assert.assertEquals("zcd", validation.Printmax(stringarray));
	}

}