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
	//if key code and argument match, Button is Pressing , then Press the Button.
	if( getButtonCode() == KeyCode ){
	    buttonPress();
	}
    }

    public void keyReleased(int KeyCode){
	if( getButtonCode() == KeyCode ){
	    buttonRelease();
	}
    }


    
}
