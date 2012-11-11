package Controller;

import java.awt.event.*;

public class ButtonConcept{
    private boolean Pressing=false;

    public void setPressing(boolean Pressing){this.Pressing = Pressing;}
    public boolean getPressing(){return Pressing;}

    public ButtonConcept(){
	setPressing(false);
    }

    public void buttonPress(){
	setPressing(true);
    }

    public void buttonRelease(){
	setPressing(false);
    }



}