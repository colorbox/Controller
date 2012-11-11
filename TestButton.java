package Controller;

import java.awt.event.*;

import static org.junit.Assert.*;
import junit.framework.JUnit4TestAdapter;
import org.junit.*;

public class TestButton{
    static private Button button;

    public static junit.framework.Test suite() {
	return new JUnit4TestAdapter(TestButton.class);
    }

    @Before public void setUp() {
	button = new Button(5);
    }

    @Test public void constructorTest(){
	assertEquals(0,button.getTime());
    }

    @Test public void incrementTimeTest(){
	button.incrementTime();
	assertEquals(1,button.getTime()); 
    }

    @Test public void buttonReleaseTest(){
	button.buttonPress();
	assertTrue(button.isPress());

	button.incrementTime();
	button.buttonRelease();
	assertTrue(!button.isPress());

	for(int i=0;i<button.getPressInterval()-2;i++){
	    button.incrementTime();
	    button.buttonPress();
	    assertTrue(!button.isPress());
	}
	
	button.incrementTime();
	button.buttonPress();
	assertTrue(button.isPress());
    }

    //test for button with time interval 0
    @Test public void zeroButtonTest(){
	Button button0 = new Button(0);

	button0.buttonPress();
	assertTrue(button0.isPress());

	button0.buttonPress();
	assertTrue(button0.isPress());

	button0.buttonRelease();
	assertFalse(button0.isPress());

    }

    @Test public void canPressTest(){
	button.setTime(10);
	button.setLastPressTime(5);
	assertTrue(button.canPress());


	for(int Time=1000;Time>=-1000;Time--){
	    button.setTime(Time);
	    if( Time-button.getLastPressTime() >= button.getPressInterval() ){
		assertTrue(button.canPress());
	    }else{
		assertFalse(button.canPress());
	    }
	}
    }

    @Test public void isPressTest(){
	button.buttonPress();
	button.buttonRelease();
	button.buttonPress();
	button.buttonRelease();
	button.buttonPress();
	button.buttonRelease();
	button.buttonPress();
	assertTrue(button.isPress());

	for(int i=0;i<4;i++){
	    button.buttonPress();
	    button.buttonRelease();
	    button.buttonPress();
	    button.buttonRelease();
	    button.buttonPress();
	    button.buttonRelease();
	    button.buttonPress();
	    button.incrementTime();
	    assertFalse(button.isPress());
	}

	button.incrementTime();
	assertTrue(button.isPress());
    }


}
