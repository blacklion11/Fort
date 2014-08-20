package fort.world;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;


public class Tile
{
	/////////  ID STUFFS//////////////////////////////////////////////////////////////////////
	public static final int NUM_TILE_IMAGES = 5;
	
	public static final int AIR = -1;
	public static final int DIRT = 0;
	public static final int GRASS = 1;
	public static final int WATER = 2;
	public static final int STONE = 3;
	public static final int SAND = 4; 
	
	public static int ID;
	
	///////// IMAGE STUFFS//////////////////////////////////////////////////////////////////
	private ArrayList<BufferedImage> images;
	
	
	/////// COLOR STUFFS /////////////////////////////////////////////////////////////////
	public static Color BLACK;
	public static Color WHITE;
	public static Color BLUE;
	public static Color GREEN;
	public static Color GRAY;
	public static Color BROWN;
	public static Color YELLOW;
	
	public Color color; 
	
	
	public Tile()
	{
		setColors();
	}
	
	public Tile(int id)
	{
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
		YELLOW = Color.yellow;
	}
	
	public void loadImages()
	{
		System.out.println(System.getProperty("user.dir"));
		images = new ArrayList<BufferedImage>();
		
		try
		{	
			images.add(DIRT, ImageIO.read(new File("res/dirt.png")));
			images.add(GRASS, ImageIO.read(new File("res/grass.png")));
			images.add(WATER, ImageIO.read(new File("res/water.png")));
		}catch(IOException e)
		{
			System.out.println("Error loading tile images");
			e.printStackTrace();
		}
		
	}
	
	
	public void setID(int id){this.ID = id;}
	public void setColor(Color c){this.color = c;}
	//public void setImage(BufferedImage image){this.image = image;}
	public void setTileImages(ArrayList<BufferedImage> images){this.images = images;}
	
	//public BufferedImage getImage(){return this.image;}
	public ArrayList<BufferedImage> getTileImages(){return images;}

	public void render(Graphics g, float x, float y)
	{	
		g.setColor(color);
		g.fillRect(x , y, TileMap.TILESIZE, TileMap.TILESIZE);
	}
}