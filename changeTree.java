package treeBuild;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Random;

public class stepTwo {
	int random = 0;
	Component node;
	
	ArrayList <Component> tree = new <Component> ArrayList();
	Random rng = new Random();
	
	public void scanTree() {
		random = rng.nextInt(tree.size());
		node = tree.get(random);
	}
	
	public void changeCell() {
		
	}
}
