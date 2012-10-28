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

public class TestStick{
    static private Stick stick;

    public static junit.framework.Test suite() {
	return new JUnit4TestAdapter(TestStick.class);
    }

    @Before public void setUp() {
	stick = new Stick();
    }

    @Test public void dnewtralDirectionTest(){
	assertEquals(5,stick.getDirection());
    }

    @Test public void upDirectionTest(){
	stick.keyPressed(KeyEvent.VK_UP);
	stick.decideDirection();
	assertEquals(8,stick.getDirection());
    }

    @Test public void downDirectionTest(){
	stick.keyPressed(KeyEvent.VK_DOWN);
	stick.decideDirection();
	assertEquals(2,stick.getDirection());
    }

    @Test public void rightDirectionTest(){
	stick.keyPressed(KeyEvent.VK_RIGHT);
	stick.decideDirection();
	assertEquals(6,stick.getDirection());
    }

    @Test public void leftDirectionTest(){
	stick.keyPressed(KeyEvent.VK_LEFT);
	stick.decideDirection();
	assertEquals(4,stick.getDirection());
    }

    @Test public void directionUpRightTest(){
	stick.keyPressed(KeyEvent.VK_UP);
	stick.keyPressed(KeyEvent.VK_RIGHT);
	stick.decideDirection();
	assertEquals(9,stick.getDirection());
    }

    @Test public void directionUpLeftTest(){
	stick.keyPressed(KeyEvent.VK_LEFT);
	stick.keyPressed(KeyEvent.VK_UP);
	stick.decideDirection();
	assertEquals(7,stick.getDirection());
    }

    @Test public void directionDownRightTest(){
	stick.keyPressed(KeyEvent.VK_RIGHT);
	stick.keyPressed(KeyEvent.VK_DOWN);
	stick.decideDirection();
	assertEquals(3,stick.getDirection());
    }

    @Test public void directionTest(){
	stick.keyPressed(KeyEvent.VK_LEFT);
	stick.keyPressed(KeyEvent.VK_DOWN);
	stick.decideDirection();
	assertEquals(1,stick.getDirection());
    }




}