package Controller;

import java.awt.event.*;

import static org.junit.Assert.*;
import org.junit.*;
import junit.framework.JUnit4TestAdapter;

public class TestKeyButton{
    private KeyButton keybutton;
    
    public static junit.framework.Test suite() {
	return new JUnit4TestAdapter(TestKeyButton.class);
    }

    @Before public void setUp() {
	keybutton = new KeyButton(1,10);;
    }

    @Test public void constructorTest(){
	assertEquals(1,keybutton.getKeyCode());
    }

    @Test public void keyPressTest(){
	keybutton.keyPress(1);
	assertTrue(keybutton.isPress());
    }

    @Test public void keyReleaseTest(){
	keybutton.keyPress(1);
	assertTrue(keybutton.isPress());

	keybutton.keyRelease(1);
	assertTrue(!keybutton.isPress());
    }


}
