package fort.world;

import org.newdawn.slick.Graphics;
import fort.world.gen.WorldGenerator;

public class World
{

	public static int WATERLEVEL = 35;
	
	TileMap tilemap;
	WorldGenerator worldGen;
	
	public World()
	{
		tilemap = new TileMap(12);
		worldGen = new WorldGenerator();
	}
	
	public void loadTileset(String s)
	{
	
	}
	
	public void generateMap()
	{
		tilemap.setTiles(worldGen.generateMap(3));
	}

	
	public void render(Graphics g)
	{
		tilemap.render(g);
	}


}