package Controller;

import java.awt.event.*;

public class KeyButton extends Button{
    private int KeyCode;

    public void setKeyCode(int KeyCode){this.KeyCode=KeyCode;}
    public int getKeyCode(){return KeyCode;}

    public KeyButton(int KeyCode,int PressInterval){
	super(PressInterval);
	setKeyCode(KeyCode);
    }

    public void keyPress(int KeyCode){
	if(getKeyCode() == KeyCode){
	    super.buttonPress();
	}
    }

    public void keyRelease(int KeyCode){
	if(getKeyCode() == KeyCode){
	    super.buttonRelease();
	}
    }

}
