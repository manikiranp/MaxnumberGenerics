package Genericsusage;

import org.junit.Assert;
import org.junit.Test;


public class FindmaximumTest {
	Findmaximum validation = new Findmaximum();

	@Test
	public  void Printmax_at_firstposition() {
		Integer[] intarray= {966,84,90};
		int	result=validation.Printmax(intarray);
		Assert.assertEquals(966, result);
	}
		@Test
	public  void Printmax_at_secondposition() {	
		Integer[] intarray= {121,123,90};
		int	result=validation.Printmax(intarray);
		Assert.assertEquals(123, result);

	
			
		
	}

}
