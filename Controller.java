package Controller;

import java.awt.event.*;

public class Controller{
    private ZButton,XButton;
    private Stick stick;

    public Controller(){
	ZButton = new Button(KeyEvent.VK_Z,10);
	XButton = new Button(KeyEvent.VK_X,10);
	stick = new Stick();
    }

    public boolean isZPress(){
	return ZButton.isPress();
    }
    public boolean isXPress(){
	return XPress.isPress();
    }

    public int getStickDirection(){
	stick.getDirection();
    }

    public void incrementTime(){
	ZButton.incrementTime();
	XButton.incrementTime();
	stick.incrementTime();
    }


    public void keyPressed(KeyEvent e){
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


