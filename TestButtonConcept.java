package Controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import junit.framework.JUnit4TestAdapter;
import junit.samples.money.IMoney;
import junit.samples.money.Money;
import junit.samples.money.MoneyBag;
import org.junit.Before;
import org.junit.Test;

public class TestButtonConcept{
    static private ButtonConcept button;

    public static junit.framework.Test suite() {
	return new JUnit4TestAdapter(TestButtonConcept.class);
    }

    @Before public void setUp() {
	button = new ButtonConcept(8);
    }

    @Test public void isPressTest(){
	button.buttonPress();
	assertTrue(button.isPress());
    }

    @Test public void resetButtonTest(){
	button.buttonPress();
	assertTrue(button.isPress());
	button.resetButton();
	assertTrue(!button.isPress());	
    }

    @Test public void incrementTimeTest(){
	button.incrementTime();
	assertEquals(1,button.getTime()); 
    }

    @Test public void canPressTest(){
	assertTrue(button.canPress());
    }

    @Test public void buttonPressTest(){
	button.buttonPress();
	assertEquals(0,button.getLastPressTime());
	assertTrue(button.isPress());
    }

    @Test public void buttonReleaseTest(){
	button.buttonPress();
	button.buttonRelease();
	assertTrue(!button.isPress());
    }

}