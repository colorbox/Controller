package Controller;

public class Stick{
    private int Direction;
    private KeyButton Up,Down,Right,Left;

    public int getDirection(){return Direction;}
    public void setDirection(int Direction){this.Direction=Direction;}

    public void incrementTime(){
	Up.incrementTime();
	Down.incrementTime();
	Right.incrementTime();
	Left.incrementTime();
	decideDirection();
    }

    public Stick(int UpCode,int DownCode,int RightCode,int LeftCode){
	Up = new KeyButton(UpCode,0);
	Down = new KeyButton(DownCode,0);
	Right = new KeyButton(RightCode,0);
	Left = new KeyButton(LeftCode,0);
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
	}else if( (up && down) || (right && left) ){
	    setDirection(5);
	}
	//not allow 3 or 4 directions input
	if( (up&&down&&right) || (up&&down&&left) || (up&&right&&left) || (down&&right&&left) || (up&&down&&right&&left)){
	    setDirection(5);
	}
    }

    public void buttonPress(int KeyCode){
	Up.keyPress(KeyCode);
	Down.keyPress(KeyCode);
	Right.keyPress(KeyCode);
	Left.keyPress(KeyCode);
    }

    public void buttonRelease(int KeyCode){
	Up.keyRelease(KeyCode);
	Down.keyRelease(KeyCode);
	Right.keyRelease(KeyCode);
	Left.keyRelease(KeyCode);
	
    }

}
