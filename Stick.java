package Controller;

import java.awt.event.*;

public class Stick{
    private int Direction;
    private boolean UpPress,DownPress,RightPress,LeftPress;

    public int getDirection(){return Direction;}
    public void setDirection(int Direction){this.Direction=Direction;}

    public void Stick(){
	setDirection(5);
    }

}
