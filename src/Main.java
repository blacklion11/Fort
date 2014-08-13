
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main
{
	
	
	public static void main(String[] args)
	{
		try
		{
			AppGameContainer game = new AppGameContainer( new Core("Fort"));
			game.setDisplayMode(Window.WIDTH, Window.HEIGHT, false);
			game.start();
		}catch(SlickException e)
		{
			System.out.println("Error creating game container");
			e.printStackTrace();
		}
	}
}