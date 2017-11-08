import java.util.ArrayList;
public class Tree{
   public Tree(){
      String type;
      ComponentMethods methods = new ComponentMethods();
      ArrayList <Component> components = methods.componentList();
      Component node;
      ArrayList <Component> tree = new <Component> ArrayList();
      
      do{
         node = chooseComponent(components);
         type = node.getType();
         if (type.equals("Conditional")){
            for(int i = 0; i < node.getNumComp(); i++){
               node.setComponent(components);   
            }
         }
         
      }while(type.equals("Conditional"));
   }
   
   public Component chooseComponent(ArrayList <Component> c){
      int index = gen.nextInt(c.size());
      Component comp = c.get(index);
      
      return comp;
   }
   
   
}
