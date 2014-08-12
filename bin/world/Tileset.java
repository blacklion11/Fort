package world;

import java.awt.image.BufferedImage;
import java.io.ImageIO;

public class Tileset
{

	BufferedImage tilesetImage;
	
	BufferedImage[][] tileImages;
	
	public Tileset(String filepath)
	{
		try
		{
			tilesetImage = ImageIO.read(new File(filepath));
		}catch(IOException e)
		{
			System.out.println("Error Loading Tileset");
			e.printStackTrace();
		}
	
	}

	
}