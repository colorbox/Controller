package Controller;

import java.awt.event.*;

public class Stick{
    private int Direction;
    private Button Up,Down,Right,Left;

    public int getDirection(){return Direction;}
    public void setDirection(int Direction){this.Direction=Direction;}

    public void incrementTime(){
	Up.incrementTime();
	Down.incrementTime();
	Right.incrementTime();
	Left.incrementTime();
    }

    public Stick(){
	Up = new Button(KeyEvent.VK_UP,0);
	Down = new Button(KeyEvent.VK_DOWN,0);
	Right = new Button(KeyEvent.VK_RIGHT,0);
	Left = new Button(KeyEvent.VK_LEFT,0);
	setDirection(5);
    }

    public void decideDirection(){
	if(Right.isPress()){
	    setDirection(6);
	}else if(Left.isPress()){
	    setDirection(4);
	}else if(Up.isPress()){
	    setDirection(8);
	}else if(Down.isPress()){
	    setDirection(2);
	}else{
	    setDirection(5);
	}
	if(Right.isPress() && Up.isPress()){
	    setDirection(9);
	}else if(Up.isPress() && Left.isPress()){
	    setDirection(7);
	}else if(Left.isPress() && Down.isPress()){
	    setDirection(1);
	}else if(Down.isPress() && Right.isPress()){	
	    setDirection(3);
	}
    }

    public void keyPressed(int KeyCode){
	Up.keyPressed(KeyCode);
	Down.keyPressed(KeyCode);
	Right.keyPressed(KeyCode);
	Left.keyPressed(KeyCode);
    }


}
