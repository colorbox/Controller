package Controller;

import java.awt.event.*;

public class Controller{
    private Button ZButton,XButton;
    private Stick stick;

    public Controller(){
	ZButton = new Button(KeyEvent.VK_Z,10);
	XButton = new Button(KeyEvent.VK_X,10);
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

    public void resetButton(){
	ZButton.resetButton();
	XButton.resetButton();
    }

    public void incrementTime(){
	stick.incrementTime();
	ZButton.incrementTime();
	XButton.incrementTime();
    }


    public void keyPressed(KeyEvent e){
	System.out.println(getStickDirection());
	int keycode = e.getKeyCode();
	ZButton.keyPressed(keycode);
	XButton.keyPressed(keycode);
	stick.keyPressed(keycode);
    }

    public void keyReleased(KeyEvent e){
	int keycode = e.getKeyCode();
	ZButton.keyReleased(keycode);
	XButton.keyReleased(keycode);
	stick.keyReleased(keycode);
    }
}


