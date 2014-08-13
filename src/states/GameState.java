package states;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.Graphics;

import world.*;

public class GameState extends BasicGameState
{
	
	World world;
	
	public void init(GameContainer gc, StateBasedGame game) throws SlickException
	{
		world = new World();
		world.generateMap();
	}

	public void update(GameContainer gc, StateBasedGame game, int delta) throws SlickException
	{
	
	}
	
	public void render(GameContainer gc, StateBasedGame game, Graphics g) throws SlickException
	{
		world.render(g);
	}
	
	public int getID(){return States.GAME;}
}