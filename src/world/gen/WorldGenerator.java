package world.gen;

import java.util.Random;


public class WorldGenerator
{

	int smooth = 8;
	
	public WorldGenerator()
	{
		
	}
	
	
	public int[][] generateMap(int mapSize)
	{
		int[][] map = null;
		
		
		//sets map size (must be 2^n + 1)
		switch(mapSize)
		{
			case 1:
				map = new int[33][33];
				break;
			case 2:
				map = new int[65][65];
				break;
			case 3:
				map = new int[257][257];
				break;
		}
		
		
		String seed = generateSeed();
		
	
		map[0][0] = Integer.parseInt(seed.substring(0,2));
		map[0][map[0].length - 1] = Integer.parseInt(seed.substring(2,4));
		map[map.length - 1][0] = Integer.parseInt(seed.substring(4,6));
		map[map.length - 1][map[0].length - 1] = Integer.parseInt(seed.substring(6,8));
		
		map = fillHeight(map);
		
		/// Debug Array Contents
		System.out.println("-------------------------------------------------------------");
		for(int i = 0; i < map.length; i++)
		{
			for(int j = 0; j < map[0].length; j++)
			{
				System.out.print(map[i][j] + "  ");
			}
			System.out.println();
			System.out.println();
		}
		System.out.println("-------------------------------------------------------------");
		
		return map;
	}
	
	
	private int[][] fillHeight(int[][] map)
	{
		
		int length = map.length / 2;
		
		//fill center tile
		map[(map.length - 1) / 2][(map[0].length - 1) /  2] = (map[0][0] + map[0][map[0].length - 1] + map[map.length - 1][0] + map[map.length - 1][map[0].length - 1]) / 4; 
		
		while (length > 0)
		{
			//do diamond step
			for(int i = 0; i < map.length / 2 / length; i++)
			{
				for(int j = 0; j < map.length / 2 / length; j++)
				{
					map = diamond(map, length + (j * 2 * length), length + (i * 2 * length), length);
				}
			}
			
			
			
			
			
			//do square step
			for(int i = 0; i < map.length / 2 / length; i++)
			{
				for(int j = 0; j < map.length / 2 / length; j++)
				{
					if(length > 1) map = square(map, length + (j * 2 * length), length + (i * 2 * length), length);
				}
			}
			
			if(length == 1)length = 0;
			length -= length / 2;
		}
		
		
		return map;
	}
	
	private int[][] diamond(int[][] map, int x, int y, int length)
	{
		if(y - length == 0)
		{
			map[y-length][x] = (map[y][x]    +   map[y - length][x - length]    +   map[y - length][x + length]) / 3 + random();
		}
		if(y + length == map.length - 1)
		{
			map[y+length][x] = (map[y][x]    +   map[y + length][x - length]    +   map[y + length][x + length]) / 3 + random();
		}else
		{
			map[y + length][x] = (map[y][x]    +    map[y + length][x - length]    +    map[y + length][x + length]    +    map[y + 2 * length][x]) / 4 + random();
		}
		if(x - length == 0)
		{
			map[y][x - length] = (map[y][x]    +   map[y - length][x - length]    +   map[y + length][x - length]) / 3 + random();
		}
		if(x + length == map[0].length - 1)
		{
			map[y][x + length] = (map[y][x]    +   map[y - length][x + length]    +   map[y + length][x + length]) / 3 + random();
		}else
		{
			map[y][x + length] = (map[y][x]    +    map[y - length][x - length]    +    map[y + length][x + length]    +    map[y][x + 2 * length]) / 4 + random();
		}
		
	
		
		
		return map;
	}
	
	private int[][] square(int[][] map, int x, int y, int length)
	{
		
		//System.out.println("Test: " + x + ", " + y);
		//System.out.println("\tUpperLeft: " + (x - (length / 2)) + ", " + (y - (length / 2)));
		map[y - length / 2][x - length / 2] = (map[y - length][x]    +    map[y][x - length]) / 2 + random();
		map[y - length / 2][x + length / 2] = (map[y - length][x]    +    map[y][x + length]) / 2 + random();
		map[y + length / 2][x - length / 2] = (map[y][x - length]    +    map[y + length][x]) / 2 + random();
		map[y + length / 2][x + length / 2] = (map[y + length][x]    +    map[y][x + length]) / 2 + random();
		
		return map;
	}
	
	
	public int random()
	{
		Random r = new Random();
		int one = r.nextInt(100);
		return (one - r.nextInt(100)) / smooth;
	}
	
	public int[][] smooth(int[][] map, int passes)
	{
		for(int i = 0; i < map.length; i++)
		{
			for(int j = 0; j < map[0].length; j++)
			{
				
			}
		}
		
		return map;
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

	
	
	
	
	
	
	
	
	
	
	
	
	
}