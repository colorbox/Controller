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
    static private ButtonConcept buttonconcept;

    public static junit.framework.Test suite() {
	return new JUnit4TestAdapter(TestButtonConcept.class);
    }

    @Before public void setUp() {
	buttonconcept = new ButtonConcept();
    }

    @Test public void buttonPressTest(){
	buttonconcept.buttonPress();
	assertTrue(buttonconcept.getPressing());
    }

    @Test public void buttonReleaseTest(){
	buttonconcept.buttonPress();
	assertTrue(buttonconcept.getPressing());
	buttonconcept.buttonRelease();
	assertTrue(!buttonconcept.getPressing());
    }



}