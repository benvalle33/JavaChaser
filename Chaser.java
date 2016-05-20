//BENJAMIN C. VALLE

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Chaser extends Applet implements KeyListener {
    	
    	int x1;
    	int y1;
    	int x2;
    	int y2;
    	int loop = 0;
    	int turnCount = 0;
    	boolean keepGoing = true;
    	char direction;
    	boolean isTurn = false;
    	int caughtSprites = 0;
    	Player player1 = new Player();
    	Enemy enemy1 = new Enemy();
    	Enemy enemy2 = new Enemy();
    	Enemy enemy3 = new Enemy();
    	Enemy enemy4 = new Enemy();
    	Enemy enemy5 = new Enemy();
    	Enemy enemy6 = new Enemy();
    	Enemy enemy7 = new Enemy();
    	Enemy enemy8 = new Enemy();
    	Sprite sprite = new Sprite();
    	
    	
    public void init()
    {
        this.setFocusable(true);
    	addKeyListener(this);
    	enemy1.randomizePosition();
    	enemy2.randomizePosition();
    	enemy3.randomizePosition();
    	enemy4.randomizePosition();
    	enemy5.randomizePosition();
    	enemy6.randomizePosition();
    	enemy7.randomizePosition();
    	enemy8.randomizePosition();
    	sprite.randomizePosition();
    	
    }
    public void keyReleased(KeyEvent e)
	{
	
		return;
	}

	public void keyTyped(KeyEvent e)
	{
   
   		return;
	}

	public void keyPressed(KeyEvent e)
	{
		if(isTurn == true)
		{	
		switch (e.getKeyCode())
		{
			case KeyEvent.VK_LEFT:
            	player1.changeX(-50);
            	isTurn = false;
            	break;
        	case KeyEvent.VK_RIGHT:
            	player1.changeX(50);
            	isTurn = false;
            	break;
        	case KeyEvent.VK_DOWN:
            	player1.changeY(50);
            	isTurn = false;
            	break;
        	case KeyEvent.VK_UP:
        		player1.changeY(-50);
        		isTurn = false;
            	break;
		}
		}
		//Detect Collision
		if(player1.getX() == enemy1.getX() && player1.getY() == enemy1.getY())
    	{
    		keepGoing = false;
    		System.out.println("Game over. You survived " + turnCount + " turns. And caught "+ caughtSprites + " sprite(s).");
    	}
    	else if(player1.getX() == enemy2.getX() && player1.getY() == enemy2.getY())
    	{
    		keepGoing = false;
    		System.out.println("Game over. You survived " + turnCount + " turns. And caught "+ caughtSprites + " sprite(s).");
    	}
    	else if(player1.getX() == enemy3.getX() && player1.getY() == enemy3.getY())
    	{
    		keepGoing = false;
    		System.out.println("Game over. You survived " + turnCount + " turns. And caught "+ caughtSprites + " sprite(s).");
    	}
    	else if(player1.getX() == enemy4.getX() && player1.getY() == enemy4.getY())
    	{
    		keepGoing = false;
    		System.out.println("Game over. You survived " + turnCount + " turns. And caught "+ caughtSprites + " sprite(s).");
    	}
    	else if(player1.getX() == enemy5.getX() && player1.getY() == enemy5.getY())
    	{
    		keepGoing = false;
    		System.out.println("Game over. You survived " + turnCount + " turns. And caught "+ caughtSprites + " sprite(s).");
    	}
    	else if(player1.getX() == enemy6.getX() && player1.getY() == enemy6.getY())
    	{
    		keepGoing = false;
    		System.out.println("Game over. You survived " + turnCount + " turns. And caught "+ caughtSprites + " sprite(s).");
    	}
    	else if(player1.getX() == enemy7.getX() && player1.getY() == enemy7.getY())
    	{
    		keepGoing = false;
    		System.out.println("Game over. You survived " + turnCount + " turns. And caught "+ caughtSprites + " sprite(s).");
    	}
    	else if(player1.getX() == enemy8.getX() && player1.getY() == enemy8.getY())
    	{
    		keepGoing = false;
    		System.out.println("Game over. You survived " + turnCount + " turns. And caught "+ caughtSprites + " sprite(s).");
    	}
    	else if(player1.getX() == sprite.getX() && player1.getY() == sprite.getY())
    	{
    		caughtSprites += 1;
    		System.out.println("Caught "+ caughtSprites + " sprite(s).");
    		sprite.randomizePosition();
    		sprite.randomMove();
    	}
    	repaint();
		
		

	}
	public void setDirection()
	{
		
		switch(direction)
		{
			case 'l':
            	player1.changeX(-50);
            	break;
        	case 'r':
            	player1.changeX(50);
            	break;
        	case 'd':
            	player1.changeY(50);
            	break;
        	case 'u':
        		player1.changeY(-50);
            	break;
            	
            
   
		}	

	}

    public void paint(Graphics g)
    {
    	if(keepGoing == true)
    	{
        	drawGrid(g);
        	player1.drawPlayer(g);
        	drawEnemies(g);
        	sprite.drawSprite(g);
        	setDirection();
        	moveEnemies();
        	sprite.randomMove();
        	//collisionDetector();
    		turnCount += 1;
    		isTurn = true;
    	}
    	else
    	{
    		Expo.setColor(g, Expo.black);
    		Expo.drawString(g, "Game over. You survived " + turnCount + " turn(s). And caught "+ caughtSprites + " sprite(s).", 50,250);
    	}
    }
    public void drawGrid(Graphics g)
    {
    	Expo.setColor(g, Expo.black);
    	drawHorizontal(g);
    	drawVertical(g);
    	
    }
    public void drawVertical(Graphics g)
    {
    	//vertical lines
    	Expo.setColor(g, Expo.black);
    	x1 = 0;
    	y1 = 50;
    	x2 = 500;
    	y2 = 50;
    	loop = 0;
    	while(loop <=10)
    	{
    		Expo.drawLine(g,y1,x1,y2,x2);
    		y1+=50;
    		y2+=50;
    		loop+=1;
    	}
    
    	
    }
    public void drawHorizontal(Graphics g)
    {
    	//change values
    	x1 = 0;
    	y1 = 50;
    	x2 = 500;
    	y2 = 50;
    	loop = 0;
    	//horizontal lines
    	while(loop <=10)
    	{
    		Expo.drawLine(g,x1,y1,x2,y2);
    		y1+=50;
    		y2+=50;
    		loop+=1;
    	}
    }
    public void drawEnemies(Graphics g)
    {
    	//draw enemies
        enemy1.drawEnemy(g);
        enemy2.drawEnemy(g);
        enemy3.drawEnemy(g);
        enemy4.drawEnemy(g);
        enemy5.drawEnemy(g);
        enemy6.drawEnemy(g);
        enemy7.drawEnemy(g);
        enemy8.drawEnemy(g);
    }
    public void moveEnemies()
    {
    	//move enemies
        enemy1.randomMove();
        enemy2.randomMove();
        enemy3.randomMove();
        enemy4.randomMove();
        enemy5.randomMove();
        enemy6.randomMove();
        enemy7.randomMove();
        enemy8.randomMove();	
    }
}
