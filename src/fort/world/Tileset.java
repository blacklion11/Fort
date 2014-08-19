package fort.world;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

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