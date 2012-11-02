package Controller;

import java.awt.event.*;

public class Button extends ButtonConcept{

    private int ButtonCode;

    public void setButtonCode(int ButtonCode){this.ButtonCode=ButtonCode;}
    public int getButtonCode(){return ButtonCode;}


    public Button(int KeyCode,int PressInterval){
	super(PressInterval);
	setButtonCode(KeyCode);
    }

    public void keyPressed(int KeyCode){
	//if key code and argument match, time interval is enough,and Button is not Pressing , then Press the Button.
	//And renew LastPressTime.
	if( getButtonCode() == KeyCode && getTime() - getLastPressTime() >= getPressInterval() && !isPress()){
	    setPressing(true);
	    setLastPressTime(getTime());
	}
    }

    public void keyReleased(int KeyCode){
	if( getButtonCode() == KeyCode ){
	    setPressing(false);
	}
    }


    
}
