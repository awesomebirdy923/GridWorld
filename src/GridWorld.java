import java.awt.Color;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {

	public GridWorld(){

		
	}
	
	public static void main(String[] args) {
		Bug bug = new Bug(Color.blue);
		Actor actor = new Actor();
		Location location = new Location(8, 8);
		World world = new World();
		world.show();
		world.add(location, bug);
	}
	
}
