package Controller;

import java.awt.event.*;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import junit.framework.JUnit4TestAdapter;
import junit.samples.money.IMoney;
import junit.samples.money.Money;
import junit.samples.money.MoneyBag;
import org.junit.Before;
import org.junit.Test;

public class TestButton{
    static private Button button;

    public static junit.framework.Test suite() {
	return new JUnit4TestAdapter(TestButton.class);
    }

    @Before public void setUp() {
	button = new Button(KeyEvent.VK_RIGHT,8);
    }

    @Test public void incrementTimeTest(){
	button.incrementTime();
	assertEquals(1,button.getTime()); 
    }

    @Test public void buttonPressTest(){
	button.keyPressed(KeyEvent.VK_RIGHT);
	assertTrue(button.getPressing());
    }

    @Test public void buttonReleaseTest(){
	button.keyPressed(KeyEvent.VK_RIGHT);
	button.testOut();
	assertTrue(button.isPress());

	button.incrementTime();
	button.keyReleased(KeyEvent.VK_RIGHT);
	assertTrue(!button.isPress());

	for(int i=0;i<button.getPressInterval()-2;i++){
	    button.incrementTime();
	    button.keyPressed(KeyEvent.VK_RIGHT);
	    assertTrue(!button.isPress());
	}
	
	button.incrementTime();
	button.keyPressed(KeyEvent.VK_RIGHT);
	assertTrue(button.isPress());
    }

    @Test public void zeroButtonTest(){
	Button button0 = new Button(1,0);

	button0.keyPressed(1);
	assertTrue(button0.isPress());
	button0.keyReleased(1);
	assertTrue(!button0.isPress());

    }

}
