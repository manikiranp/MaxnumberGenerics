package Genericsusage;

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

}
