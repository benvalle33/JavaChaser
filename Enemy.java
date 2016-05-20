import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.net.*;
import javax.imageio.*;

public class Enemy extends Applet{
	int xPos = 475;
	int yPos = 475;
	public Enemy()
	{

	}

	public Enemy(Graphics g)
	{
		
	}
	public void randomizePosition()
	{
		int whereTo = Expo.random(1,4);
		switch(whereTo)
		{
			case 1:
            	//do nothing
            	break;
        	case 2:
            	xPos = 225;
            	yPos = 225;
            	break;
        	case 3:
        		xPos = 25;
        		yPos = 475;
            	break;
        	case 4:
        		xPos = 475;
        		yPos = 25;
            	break;
		}
	}
	
	public void drawEnemy(Graphics g)
	{	
		
		Expo.setColor(g, Expo.red);
		Expo.fillCircle(g, xPos, yPos, 25);
			
		
	}
	public void randomMove()
	{
		int xory = Expo.random(0,3);
		if(xory == 0)
		{
			changeX(50);
		}
		else if(xory == 1)
		{
			changeX(-50);
		}
		else if(xory == 2)
		{
			changeY(50);
		}
		else if(xory == 3)
		{
			changeY(-50);
		}
		else
		{
			//do nothing
		}
	}
	
	public void changeX(int value)
	{	
		xPos += value;
		if(xPos <= 0 || xPos >= 500)
		{
			xPos -= value;
		}
	}
	public void changeY(int value)
	{	
		yPos += value;
		if(yPos <= 0 || yPos >= 500)
		{
			yPos -= value;
		}
	}
	public int getX()
	{	
		return(xPos);
	}
	public int getY()
	{	
		return(yPos);
	}
	public static void main(String[] args)
	{
		System.out.println("Who's the real enemy?");
	}
}

