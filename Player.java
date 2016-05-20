import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.net.*;
import javax.imageio.*;

public class Player extends Applet{
	int xPos = 275;
	int yPos = 275;
	public Player()
	{
		
	}

	public Player(Graphics g)
	{
		
	}
	
	public void drawPlayer(Graphics g)
	{	
		Expo.setColor(g, Expo.blue);
		Expo.fillCircle(g, xPos, yPos, 25);
			
		
	}
	
	public void changeX(int value)
	{	
		xPos += value;
		if(xPos <= 0 || xPos >=500)
		{
			xPos -= value;
			System.out.println("Illegal move.");
		}
	}
	public void changeY(int value)
	{	
		yPos += value;
		if(yPos <= 0 || yPos >= 500)
		{
			yPos -= value;
			System.out.println("Illegal move.");
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
}
