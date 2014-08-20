package fort.world;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Color;

import fort.Window;

import java.util.Random;
import java.util.ArrayList;

public class TileMap
{
	public static int TILESIZE;

	Tile[][] tiles;
	Tile tileRef;
	
	public TileMap(int tilesize)
	{
		this.TILESIZE = tilesize;
		tileRef = new Tile();
	
	}
	
	public void setTiles(int[][] map)
	{
		tiles = new Tile[map.length][map[0].length];
		
		for(int i = 0; i < tiles.length; i++)
		{
			for(int j = 0; j < tiles[0].length; j++)
			{	
				if(map[i][j] <= 35)
				{
					tiles[i][j] = new Tile(Tile.BLUE, Tile.WATER);
				}
				if(map[i][j] > 35 && map[i][j] <= 200)
				{
					tiles[i][j] = new Tile(Tile.BROWN, Tile.DIRT);
				}
				/*if(map[i][j] > 35 && map[i][j] <= 60)
				{
					tiles[i][j] = new Tile(Tile.GREEN, Tile.GRASS);
				}
				if(map[i][j] > 60 && map[i][j] <= 80)
				{
					tiles[i][j] = new Tile(Tile.BROWN, Tile.DIRT);
				}
				if(map[i][j] > 80)
				{
					tiles[i][j] = new Tile(Tile.GRAY, Tile.STONE);
				}
				*/  
			}
		}
	}
	
	public void render(Graphics g)
	{
		
		for(int i = 0; i < tiles.length; i++)
		{
			for(int j = 0; j < tiles[0].length; j++)
			{
				g.setColor(tiles[i][j].color);
				g.fillRect(Window.X + j * TILESIZE, Window.Y + i * TILESIZE, TILESIZE, TILESIZE);
			}
		}
		
	}
	
	private void loadTileImages()
	{
		System.out.println(System.getProperty("user.dir"));
		images = tileRef.getTileImages();
		
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
		
		tileRef.setTileImages(images);
	}


}