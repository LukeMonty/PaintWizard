package paintWizardTest;

import static org.junit.Assert.*;

import paintWizard.*;

import org.junit.jupiter.api.Test;

public class TestPaintWizard {
	
	@Test
	public void testCalculateCostPerM() {
		
		Paint paint = new Paint("Paint1",10, 10);
		assertEquals(1, paint.getCostPerM2(paint), 1);
		
	}
	@Test
	public void testCompareCost() {
		
		Paint paint = new Paint("Paint1",10, 10);
		Paint paint2 = new Paint("Paint2",12, 15);
		assertEquals(paint2.getName() + " is cheaper", paint.compareCost(paint, paint2));
	}
	@Test
	public void testCompareCost1() {
		
		Paint paint = new Paint("Paint1",10, 10);
		Paint paint2 = new Paint("Paint2",16, 15);
		assertEquals(paint.getName() + " is cheaper", paint.compareCost(paint, paint2));
	}@Test
	public void testCompareEqualCost() {
		
		Paint paint = new Paint("Paint1",10, 10);
		Paint paint2 = new Paint("Paint2",20, 20);
		assertEquals("Both are the same price", paint.compareCost(paint, paint2));
	}
	@Test
	public void testWaste() {
		
		Paint paint = new Paint("Paint1",10,10);
		assertEquals(0, paint.calculateWaste(10, paint), 0.1);
		
	}
	@Test
	public void testExcessWaste() {
		Paint paint = new Paint("Paint1",10,11);
		assertEquals(1, paint.calculateWaste(10, paint), 0.1);
	}
	@Test
	public void testLessWaste() {		//Less than what is required, so gets another bucket of paint
		Paint paint = new Paint("Paint1",10,9);
		assertEquals(8, paint.calculateWaste(10, paint), 0.1);
	}
	@Test
	public void testTripleWaste() {
		Paint paint = new Paint("Paint1",10,9);
		assertEquals(3, paint.calculateWaste(24, paint), 0.1);
	}
	@Test
	public void testWasteCost() {
		
	}

}
