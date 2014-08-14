package world.gen;

import java.util.Random;
import java.util.ArrayList;

public class WorldGenerator
{


	public WorldGenerator()
	{
		
	}
	
	
	public int[][] generateMap(int mapSize)
	{
		int iterations = 0;
		
		switch(mapSize)
		{
			case 1:
				iterations = 3;
				break;
			case 2:
				iterations = 5;
				break;
			case 3:
				iterations = 7;
				break;
		}
		
		String seed = generateSeed();
		
		ArrayList<Integer> mapList = new ArrayList<Integer>();
		
		return null;
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

	private ArrayList<Integer> diamondSquare(ArrayList<Integer> map)
	{
	
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}