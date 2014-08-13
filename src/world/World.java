package world;

import org.newdawn.slick.Graphics;

public class World
{
	
	TileMap tilemap;
	
	
	public World()
	{
		tilemap = new TileMap(15);
		
	}
	
	public void loadTileset(String s)
	{
	
	}
	
	public void generateMap()
	{
		tilemap.generateTileMap();
	}

	
	public void render(Graphics g)
	{
		tilemap.render(g);
	}


}