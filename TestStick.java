package Controller;

import java.awt.event.*;

import static org.junit.Assert.*;
import org.junit.*;
import junit.framework.JUnit4TestAdapter;

public class TestStick{
    static private Stick stick;

    public static junit.framework.Test suite() {
	return new JUnit4TestAdapter(TestStick.class);
    }

    @Before public void setUp() {
	stick = new Stick(KeyEvent.VK_UP,KeyEvent.VK_DOWN,KeyEvent.VK_RIGHT,KeyEvent.VK_LEFT);
    }

    @Test public void newtralDirectionTest(){
	assertEquals(5,stick.getDirection());
    }

    @Test public void upDirectionTest(){
	stick.buttonPress(KeyEvent.VK_UP);
	stick.decideDirection();
	assertEquals(8,stick.getDirection());
    }

    @Test public void downDirectionTest(){
	stick.buttonPress(KeyEvent.VK_DOWN);
	stick.decideDirection();
	assertEquals(2,stick.getDirection());
    }

    @Test public void rightDirectionTest(){
	stick.buttonPress(KeyEvent.VK_RIGHT);
	stick.decideDirection();
	assertEquals(6,stick.getDirection());
    }

    @Test public void leftDirectionTest(){
	stick.buttonPress(KeyEvent.VK_LEFT);
	stick.decideDirection();
	assertEquals(4,stick.getDirection());
    }

    @Test public void directionUpRightTest(){
	stick.buttonPress(KeyEvent.VK_UP);
	stick.buttonPress(KeyEvent.VK_RIGHT);
	stick.decideDirection();
	assertEquals(9,stick.getDirection());
    }

    @Test public void directionUpLeftTest(){
	stick.buttonPress(KeyEvent.VK_LEFT);
	stick.buttonPress(KeyEvent.VK_UP);
	stick.decideDirection();
	assertEquals(7,stick.getDirection());
    }

    @Test public void directionDownRightTest(){
	stick.buttonPress(KeyEvent.VK_RIGHT);
	stick.buttonPress(KeyEvent.VK_DOWN);
	stick.decideDirection();
	assertEquals(3,stick.getDirection());
    }

    @Test public void directionDownLeftTest(){
	stick.buttonPress(KeyEvent.VK_LEFT);
	stick.buttonPress(KeyEvent.VK_DOWN);
	stick.decideDirection();
	assertEquals(1,stick.getDirection());
    }

    @Test public void direction3DTest(){
	stick.buttonPress(KeyEvent.VK_LEFT);
	stick.buttonPress(KeyEvent.VK_DOWN);
	stick.buttonPress(KeyEvent.VK_UP);
	stick.decideDirection();
	assertEquals(5,stick.getDirection());
    }


    @Test public void directionManyTest(){
	stick.buttonPress(KeyEvent.VK_UP);
	stick.decideDirection();
	assertEquals(8,stick.getDirection());
	stick.buttonRelease(KeyEvent.VK_UP);

	stick.buttonPress(KeyEvent.VK_DOWN);
	stick.decideDirection();
	assertEquals(2,stick.getDirection());
	stick.buttonRelease(KeyEvent.VK_DOWN);

	stick.buttonPress(KeyEvent.VK_RIGHT);
	stick.decideDirection();
	assertEquals(6,stick.getDirection());
	stick.buttonRelease(KeyEvent.VK_RIGHT);

	stick.buttonPress(KeyEvent.VK_LEFT);
	stick.decideDirection();
	assertEquals(4,stick.getDirection());
	stick.buttonRelease(KeyEvent.VK_LEFT);

	stick.buttonPress(KeyEvent.VK_UP);
	stick.buttonPress(KeyEvent.VK_RIGHT);
	stick.decideDirection();
	assertEquals(9,stick.getDirection());
	stick.buttonRelease(KeyEvent.VK_RIGHT);

	stick.buttonPress(KeyEvent.VK_LEFT);
	stick.buttonPress(KeyEvent.VK_UP);
	stick.decideDirection();
	assertEquals(7,stick.getDirection());
	stick.buttonRelease(KeyEvent.VK_UP);
	stick.buttonRelease(KeyEvent.VK_LEFT);

	stick.buttonPress(KeyEvent.VK_RIGHT);
	stick.buttonPress(KeyEvent.VK_DOWN);
	stick.decideDirection();
	assertEquals(3,stick.getDirection());
	stick.buttonRelease(KeyEvent.VK_RIGHT);

	stick.buttonPress(KeyEvent.VK_LEFT);
	stick.buttonPress(KeyEvent.VK_DOWN);
	stick.decideDirection();
	assertEquals(1,stick.getDirection());
	stick.buttonRelease(KeyEvent.VK_LEFT);
	stick.buttonRelease(KeyEvent.VK_DOWN);

	stick.buttonPress(KeyEvent.VK_LEFT);
	stick.buttonPress(KeyEvent.VK_DOWN);
	stick.buttonPress(KeyEvent.VK_UP);
	stick.decideDirection();
	assertEquals(5,stick.getDirection());
	stick.buttonRelease(KeyEvent.VK_UP);
	stick.buttonRelease(KeyEvent.VK_DOWN);
	stick.buttonRelease(KeyEvent.VK_LEFT);

	stick.buttonPress(KeyEvent.VK_LEFT);
	stick.buttonPress(KeyEvent.VK_DOWN);
	stick.decideDirection();
	assertEquals(1,stick.getDirection());
	stick.buttonRelease(KeyEvent.VK_LEFT);
	stick.buttonRelease(KeyEvent.VK_DOWN);
    }



}