
import java.awt.Component;
import java.util.ArrayList;
import java.util.Random;

public class changeTree {
	int random = 0;
	Component node;
	Component newNode;
	String type;
    ComponentMethods methods = new ComponentMethods();
    ArrayList <Component> components = methods.componentList();
    ArrayList <Component> tree = new <Component> ArrayList();
	Random rng = new Random();
	
	public void scanTree() {
		random = rng.nextInt(tree.size());
		node = tree.get(random);
	}
	
	public void changeCell() {
		newNode = chooseComponent(components);
		newNode.setComponentOrientation(components);
	}
	
	public Component chooseComponent(ArrayList <Component> c){
	      int index = gen.nextInt(c.size());
	      Component comp = c.get(index);
	      
	      return comp;
	   }
}
