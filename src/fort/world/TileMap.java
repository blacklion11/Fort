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
	
	public TileMap(int tilesize)
	{
		this.TILESIZE = tilesize;
	
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
		
		for(int i = 0; i < Window.WIDTH / TILESIZE; i++)
		{
			for(int j = 0; j < Window.HEIGHT / TILESIZE; j++)
			{
				if(Window.X / TILESIZE + i < tiles.length && Window.X / TILESIZE + i > 0)
				{
					if(Window.Y / TILESIZE + j < tiles.length && Window.Y / TILESIZE + j > 0)
					{
						tiles[(int)Window.X / TILESIZE + i][(int)Window.Y / TILESIZE + j].render(g,Window.X,Window.Y);
					}
				}
			}
		}
		
	}


}