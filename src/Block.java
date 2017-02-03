//Name -Carson Freimuth	
//Date -1/30/17
//Class -CPII
//Lab  - Pong

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
	
	}

	//add other Block constructors - x , y , width, height, color
	
	public Block(int x, int y, int width, int height, Color color)
	{
		xPos = x;
		yPos = y;
		this.width = width;
		this.height = height;
		this.color = color;
	}
		
	
	

	//add the other set methods

	

	public void setWidth(int width)
	{
		
	}
	
	public void setHeight(int height)
	{
		
	}
	public void setPos(int x, int y) 
	{
		
		
	}
   

   public void setColor(Color col)
   {


   }

   public void draw(Graphics window)
   {
     	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

 

public void draw(Graphics window, Color col)
   {


   }
   
	public boolean equals(Object obj)
	{




		return false;
	}   
	
	
	public int getX()
	{
		return xPos;
	}
	
	public int getY(int y)
	{
		return yPos;
	}
	
	
	
	private int getHeight()
	{
		return 100;
	}
   
	private int getWidth()
	{
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
   //add the other get methods
    
	public String toString()
	{
	return "" + xPos + " "+yPos+" "+width+" "+height+" "+ color;
	}
   //add a toString() method  - x , y , width, height, color

@Override
public void setX(int x) {
	// TODO Auto-generated method stub
	
}

@Override
public void setY(int y) {
	// TODO Auto-generated method stub
	
}

@Override
public int getY() {
	// TODO Auto-generated method stub
	return 0;
}






}