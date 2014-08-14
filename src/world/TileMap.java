package world;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Color;

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
				if(map[i][j] <= 25)
				{
					tiles[i][j] = new Tile(Tile.WHITE, 0);
				}
				if(map[i][j] > 25 && map[i][j] <= 50)
				{
					tiles[i][j] = new Tile(Tile.BLUE, 1);
				}
				if(map[i][j] > 50 && map[i][j] <= 75)
				{
					tiles[i][j] = new Tile(Tile.GREEN, 2);
				}
				if(map[i][j] > 75 && map[i][j] <= 99)
				{
					tiles[i][j] = new Tile(Tile.BROWN, 3);
				}
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
				g.fillRect((float)(i * TILESIZE), (float) (j * TILESIZE), (float) ((i*TILESIZE) + TILESIZE), (float) ((j*TILESIZE) + TILESIZE));
			}	
		}
	}


}