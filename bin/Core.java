

import org.newdawn.slick.state.*;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Core extends StateBasedGame
{


	public Core(String name)
	{
		super(name);
		
		
	}

	public void init()
	{
	
	}
	
	public void initStatesList(GameContainer gc)
	{
		gc.setMaximumLogicUpdateInterval(33);
		gc.setTargetFrameRate(60);
		gc.setAlwaysRender(true);
		gc.setShowFPS(true);
		gc.setVSync(true);
	}
}