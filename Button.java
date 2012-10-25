package Controler;

import java.awt.event.*;

public class Button{

    private int Time;
    private int ButtonCode;
    private int LastPressTime;
    private int PressInterval;
    private boolean Pressing;

    public void setButtonCode(int ButtonCode){this.ButtonCode=ButtonCode;}
    public void setTime(int Time){this.Time=Time;}
    public void setLastPressTime(int LastPressTIme){this.LastPressTime=LastPressTime;}
    public void setPressInterval(int PressInterval){this.PressInterval=PressInterval;}
    public void setPressing(boolean Pressing){this.Pressing = Pressing;}

    public int getButtonCode(){return ButtonCode;}
    public int getTime(){return Time;}
    public int getLastPressTime(){return LastPressTime;}
    public int getPressInterval(){return PressInterval;}
    public boolean getPressing(){return Pressing;}

    public Button(int KeyCode){
	setButtonCode(KeyCode);
	setTime(0);
	setLastPressTime(0);
	setPressInterval(8);
    }

    public boolean isPress(){return getPressing();}

    public void incrementTime(){
	setTime(getTime()+1);
    }

    public void keyPressed(int KeyCode){
	//if key code and argument match, time interval is enough,Button is not Pressing , then Press the Button.and renew LastPressTime.
	if( getButtonCode() == KeyCode && getTime() - getLastPressTime() > getPressInterval() && !isPress()){
	    Pressing = true;
	    setLastPressTime(getTime());
	}
    }

    public void keyReleaseed(int KeyCode){
	if( getButtonCode() == KeyCode ){
	    Pressing = false;
	}
    }


    
}
