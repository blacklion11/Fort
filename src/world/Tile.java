package world;

import java.awt.image.BufferedImage;
import java.awt.Color;


public class Tile
{
	public static final int AIR = 0;
	public static final int DIRT = 1;
	public static final int GRASS = 2;
	
	public static int ID;
	
	private BufferedImage image;
	
	public Color color; 
	
	
	public Tile(){}
	
	public Tile(BufferedImage image, int id)
	{
		this.image = image;
		this.ID = id;
	}
	
	public Tile(Color c, int id)
	{
		this.color = c;
		this.ID = id;
	}
	
	
	public void setID(int id){this.ID = id;}
	public void setColor(Color c){this.color = c;}
	public void setImage(BufferedImage image){this.image = image;}
	
	public BufferedImage getImage(){return this.image;}
	


}