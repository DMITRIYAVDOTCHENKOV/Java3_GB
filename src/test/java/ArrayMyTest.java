import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import src.ru.avdotchenkov.lesson6.ArrayMy;

public class ArrayMyTest {
	
	@Before
	public void array() {
	
	}
	
	@Test public void testPositiveArrayNOffset (int[] array, int n) {
		int [] expected = {1,2,3,4,5,6};
		int [] source = {2,3,4,5,6,1};
		Assert.assertArrayEquals(expected, source);
	}
	
	;
	
	
	@Test void testNegativeArrayNOffset (int[] array, int n) {
	
	}
	
}



