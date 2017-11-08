import java.util.Random;
import java.util.ArrayList;
public class Conditional extends Component{
   
   Random gen = new Random();
   int numComponents;
   ArrayList <Component> components;
   
   public Conditional(String name, int comp/*, Component[] c*/){
      super(name);
      super.setType("Conditionals");
      numComponents = comp;
      components = new <Component> ArrayList(numComponents);
      //setComponents(c);
   }
   
   public Component chooseComponent(ArrayList <Component> c){
      int index = gen.nextInt(c.size());
      Component comp = c.get(index);
      
      return comp;
   }
   
   public int getNumComp(){
      return numComponents;
   } 
   
   public void setComponents(ArrayList <Component> c){
      for(int i = 0; i < numComponents; i++){
         components.add(chooseComponent(c));
      }
   }
   
   public ArrayList<Component> getComponents(){
      return components;
   } 
}
