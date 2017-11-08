import java.util.Random;
import java.util.ArrayList;

public class ComponentMethods{
   Conditional closeToWall, farFromWall, doTwoFarFar, doTwoCloseClose, doTwoFarClose, doTwoCloseFar;
   Component goForward, turnRight, turnLeft, backup, turnParallelToPosition, turnSquareWithWall;
   //ArrayList <Component> list = new <Component> ArrayList();
   
   public ComponentMethods(){
      closeToWall = new Conditional("closeToWall()", 1);
      farFromWall = new Conditional("farFromWall()", 1);
      doTwoFarFar = new Conditional("doTwoFarFar()", 2);
      doTwoCloseClose = new Conditional("doTwoCloseClose()", 2);
      doTwoFarClose = new Conditional("doTwoFarClose()", 2);
      doTwoCloseFar = new Conditional("doTwoCloseFar()", 2);
      
      goForward = new Component("goForward()");
      turnRight = new Component("turnRight()");
      turnLeft = new Component("turnLeft()"); 
      backup = new Component("backup()");
      turnParallelToPosition = new Component("turnParallelToPostion()");
      turnSquareWithWall = new Component("turnSquareWithWall()");
   }
   
   public ArrayList<Component> componentList(){
      ArrayList <Component> list = new <Component> ArrayList();
      list.add(closeToWall);
      list.add(farFromWall); 
      list.add(doTwoFarFar);
      list.add(doTwoCloseClose);
      list.add(doTwoFarClose); 
      list.add(doTwoCloseFar);
      
      list.add(goForward);
      list.add(turnRight);
      list.add(turnLeft); 
      list.add(backup);
      list.add(turnParallelToPosition);
      list.add(turnSquareWithWall);
      
      return list;
   }
   
   public ArrayList<Component> onlyComponents(){
      ArrayList <Component> list = new <Component> ArrayList();
      
      list.add(goForward);
      list.add(turnRight);
      list.add(turnLeft); 
      list.add(backup);
      list.add(turnParallelToPosition);
      list.add(turnSquareWithWall);

      
      return list;
   }
   

}
