package world;

import org.newdawn.slick.Graphics;
import world.gen.WorldGenerator;

public class World
{
	
	TileMap tilemap;
	WorldGenerator worldGen;
	
	
	public World()
	{
		tilemap = new TileMap(15);
		worldGen = new WorldGenerator();
	}
	
	public void loadTileset(String s)
	{
	
	}
	
	public void generateMap()
	{
		tilemap.setTiles(worldGen.generateMap(2));
	}

	
	public void render(Graphics g)
	{
		tilemap.render(g);
	}


}