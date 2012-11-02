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
	decideDirection();
    }

    public Stick(){
	Up = new Button(KeyEvent.VK_UP,0);
	Down = new Button(KeyEvent.VK_DOWN,0);
	Right = new Button(KeyEvent.VK_RIGHT,0);
	Left = new Button(KeyEvent.VK_LEFT,0);
	setDirection(5);
    }

    public void decideDirection(){
	boolean up=Up.isPress();
	boolean down=Down.isPress();
	boolean right=Right.isPress();
	boolean left=Left.isPress();
	if(right){
	    setDirection(6);
	}else if(left){
	    setDirection(4);
	}else if(up){
	    setDirection(8);
	}else if(down){
	    setDirection(2);
	}else{
	    setDirection(5);
	}
	if(right && up){
	    setDirection(9);
	}else if(up && left){
	    setDirection(7);
	}else if(left && down){
	    setDirection(1);
	}else if(down && right){	
	    setDirection(3);
	}
    }

    public void keyPressed(int KeyCode){
	System.out.println(KeyCode);
	Up.keyPressed(KeyCode);
	Down.keyPressed(KeyCode);
	Right.keyPressed(KeyCode);
	Left.keyPressed(KeyCode);
    }

    public void keyReleased(int KeyCode){
	Up.keyReleased(KeyCode);
	Down.keyReleased(KeyCode);
	Right.keyReleased(KeyCode);
	Left.keyReleased(KeyCode);
	
    }

}
