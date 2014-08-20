package fort;

import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import fort.states.*;

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
		gc.setMinimumLogicUpdateInterval(33);
		gc.setTargetFrameRate(120);
		gc.setAlwaysRender(true);
		gc.setShowFPS(true);
		gc.setVSync(false);  // <---------------- option to sync the display with the vertical refresh
		
		this.addState(new GameState());
		//this.addState(new StartMenuState());
	}
}