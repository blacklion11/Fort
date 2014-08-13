package world;

import java.awt.image.BufferedImage;
import org.newdawn.slick.Color;


public class Tile
{
	/////////  ID STUFFS//////////////////////////////////////////////////////////////////////
	public static final int AIR = 0;
	public static final int DIRT = 1;
	public static final int GRASS = 2;
	public static final int WATER = 3;
	
	public static int ID;
	
	///////// IMAGE STUFFS//////////////////////////////////////////////////////////////////
	private BufferedImage image;
	
	
	/////// COLOR STUFFS /////////////////////////////////////////////////////////////////
	public static Color BLACK;
	public static Color WHITE;
	public static Color BLUE;
	public static Color GREEN;
	public static Color GRAY;
	public static Color BROWN;
	
	public Color color; 
	
	
	public Tile()
	{
		setColors();
	}
	
	public Tile(BufferedImage image, int id)
	{
		this.image = image;
		this.ID = id;
		setColors();
	}
	
	
	public Tile(Color c, int id)
	{
		this.color = c;
		this.ID = id;
		setColors();
	}
	
	private void setColors()
	{
		BLACK = Color.black;
		WHITE = Color.white;
		BLUE = Color.blue;
		GREEN = Color.green;
		GRAY = Color.gray;
		BROWN = new Color(87,59,12);
	}
	
	
	public void setID(int id){this.ID = id;}
	public void setColor(Color c){this.color = c;}
	public void setImage(BufferedImage image){this.image = image;}
	
	public BufferedImage getImage(){return this.image;}
	


}