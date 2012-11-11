package Controller;

import java.awt.event.*;

public class Controller{
    private KeyButton ZButton,XButton;
    private Stick stick;

    public Controller(){
	ZButton = new KeyButton(KeyEvent.VK_Z,10);
	XButton = new KeyButton(KeyEvent.VK_X,10);
	stick = new Stick(KeyEvent.VK_UP,KeyEvent.VK_DOWN,KeyEvent.VK_RIGHT,KeyEvent.VK_LEFT);
    }

    public boolean isZPress(){
	return ZButton.isPress();
    }

    public boolean isXPress(){
	return XButton.isPress();
    }

    public int getStickDirection(){
	return stick.getDirection();
    }

    public void incrementTime(){
	stick.incrementTime();
	ZButton.incrementTime();
	XButton.incrementTime();
    }


    public void keyPressed(KeyEvent e){
	int keycode = e.getKeyCode();
	ZButton.keyPress(keycode);
	XButton.keyPress(keycode);
	stick.buttonPress(keycode);
    }

    public void keyReleased(KeyEvent e){
	int keycode = e.getKeyCode();
	ZButton.keyRelease(keycode);
	XButton.keyRelease(keycode);
	stick.buttonRelease(keycode);
    }
}


