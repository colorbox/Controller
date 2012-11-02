package Controller;

import java.awt.event.*;

public class ButtonConcept{
    private int Time;
    private int LastPressTime;
    private int PressInterval;
    private boolean Pressing=false;

    public void setTime(int Time){this.Time=Time;}
    public void setLastPressTime(int LastPressTime){this.LastPressTime=LastPressTime;}
    public void setPressInterval(int PressInterval){this.PressInterval=PressInterval;}
    public void setPressing(boolean Pressing){this.Pressing = Pressing;}

    public int getTime(){return Time;}
    public int getLastPressTime(){return LastPressTime;}
    public int getPressInterval(){return PressInterval;}
    public boolean getPressing(){return Pressing;}


    public ButtonConcept(int PressInterval){
	setTime(0);
	setPressInterval(PressInterval);
	setLastPressTime( -1*getPressInterval() );
	setPressing(false);

    }

    public boolean isPress(){return getPressing();}

    public void resetButton(){setPressing(false);}

    public void incrementTime(){
	setTime(getTime()+1);
    }



}