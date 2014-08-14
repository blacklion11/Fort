package world.gen;

import java.util.Random;

public class WorldGenerator
{


	public WorldGenerator()
	{
		
	}
	
	
	public void generateMap(int mapSize)
	{
		int iterations = 0;
		
		switch(mapSize)
		{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
		}
		
		
		
	}
	
	private String generateSeed()
	{
		Random r = new Random();
	
		//set the four corner seeds for the map
		String seed = "" + r.nextInt(100);
		seed += r.nextInt(100);
		seed += r.nextInt(100);
		seed += r.nextInt(100);
		
		System.out.println(seed);
		
		return seed;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}