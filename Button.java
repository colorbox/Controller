package Controller;

import java.awt.event.*;

public class Button{
    private int ButtonCode;
    private int Time;
    private int LastPressTime;
    private int PressInterval;
    private boolean Pressing=false;

    public void setButtonCode(int ButtonCode){this.ButtonCode=ButtonCode;}
    public void setTime(int Time){this.Time=Time;}
    public void setLastPressTime(int LastPressTime){this.LastPressTime=LastPressTime;}
    public void setPressInterval(int PressInterval){this.PressInterval=PressInterval;}
    public void setPressing(boolean Pressing){this.Pressing = Pressing;}

    public int getButtonCode(){return ButtonCode;}
    public int getTime(){return Time;}
    public int getLastPressTime(){return LastPressTime;}
    public int getPressInterval(){return PressInterval;}
    public boolean getPressing(){return Pressing;}

    public Button(int KeyCode,int PressInterval){
	setButtonCode(KeyCode);
	setTime(0);
	setPressInterval(PressInterval);
	setLastPressTime( -1*getPressInterval() );
	setPressing(false);
    }

    public boolean isPress(){return getPressing();}

    public void resetButton(){setPressing(false);}

    public void incrementTime(){
	setTime(getTime()+1);
	resetButton();
    }

    public void keyPressed(int KeyCode){
	//if key code and argument match, time interval is enough,and Button is not Pressing , then Press the Button.
	//And renew LastPressTime.
	if( getButtonCode() == KeyCode && getTime() - getLastPressTime() >= getPressInterval() && !isPress()){
	    Pressing = true;
	    setLastPressTime(getTime());
	}
    }

    public void keyReleased(int KeyCode){
	if( getButtonCode() == KeyCode ){
	    Pressing = false;
	}
    }


    
}
