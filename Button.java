package Controller;

public class Button extends ButtonConcept{

    private int Time;
    private int LastPressTime;
    private int PressInterval;

    public void setTime(int Time){this.Time=Time;}
    public void setLastPressTime(int LastPressTime){this.LastPressTime=LastPressTime;}
    public void setPressInterval(int PressInterval){this.PressInterval=PressInterval;}

    public int getTime(){return Time;}
    public int getLastPressTime(){return LastPressTime;}
    public int getPressInterval(){return PressInterval;}

    public Button(int PressInterval){
	setTime(0);
	setPressInterval(PressInterval);
	setLastPressTime( -1*getPressInterval() );
    }

    //If time interval is enough then player can press the button.
    public boolean canPress(){
	return ( getTime() - getLastPressTime() >= getPressInterval() ) ;
    }

    public boolean isPress(){
	//can Press and button is pressing ,then return true.
	if( canPress() && getPressing() ){
	    setLastPressTime(getTime());
	    return getPressing();
	}
	return false;
    }

    public void incrementTime(){setTime(getTime()+1);}



    
}
