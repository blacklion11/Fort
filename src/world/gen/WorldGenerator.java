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
		
		ArrayList<ArrayList<Integer>> mapList = new ArrayList<ArrayList<Integer>>();
		mapList.add(new ArrayList<Integer>());
		mapList.add(new ArrayList<Integer>());
		
		mapList.get(0).add(new Integer(Integer.parseInt(seed.substring(0,2))));
		mapList.get(0).add(new Integer(Integer.parseInt(seed.substring(2,4))));
		mapList.get(1).add(new Integer(Integer.parseInt(seed.substring(4,6))));
		mapList.get(1).add(new Integer(Integer.parseInt(seed.substring(6,8))));
		
		mapList = diamondSquare(mapList);
		
		for(int i = 0; i < mapList.size(); i++)
		{
			System.out.print(mapList.get(0).get(i) + ", ");
		}
		System.out.println();
		
		mapList = diamondSquare(mapList);
		
		for(int i = 0; i < mapList.size(); i++)
		{
			System.out.print(mapList.get(0).get(i) + ", ");
		}
		
		
		
		return null;
	}
	
	private String generateSeed()
	{
		Random r = new Random();
	
		//set the four corner seeds for the map
		String seed = "";
		for(int i = 0; i < 4; i++)
		{
			int temp = r.nextInt(100);
			if(temp < 10)
				seed += "0" + temp;
			else 
				seed += temp;
		}
		
		System.out.println("Seed: " + seed);
		
		return seed;
	}

	private ArrayList<ArrayList<Integer>> diamondSquare(ArrayList<ArrayList<Integer>> map)
	{
		int lengthX = map.size();
		int lengthY = map.get(0).size();
		
		for(int i = 0; i < lengthX - 1; i++)
		{
			for(int j = 0; j < lengthY - 1; j++)
			{
				map.get(i).add(i + 1, (map.get(i).get(j).intValue() + map.get(i + 1).get(j).intValue()) / 2);
			}
		}
	
		return map;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}