import java.util.*;

public class ExampleRoom {	
	public static void main(String[] args) {
		
		Robot robot = new Robot("xxxxx\n    x\nxxx x\nx xxx\nx    \nxxxxx", 0, 0); //maze map
      
		 
		 boolean[][] position= new boolean[6][5]; //by default value is false 
		 position[0][0] = true;
		 int xcounter =0;
		 int ycounter =0;
		 boolean go = false;
	
	while (!go) {
		
		if(robot.check('e') && (position[xcounter][ycounter+1]==false) ) { //if available and not visited
			robot.go('e');
			position[xcounter][ycounter+1]=true;
			ycounter++;										
		}
		else
		
		if(robot.check('w') && (position[xcounter][ycounter-1]==false)) {
		robot.go('w');
		position[xcounter][ycounter-1]=true;
		ycounter--;						
		}
		else
			
		if(robot.check('n') && (position[xcounter-1][ycounter]==false) ) { 
		robot.go('n');
		position[xcounter-1][ycounter]=true;
		xcounter--;						
		}		
		else
			
		if(robot.check('s') && (position[xcounter+1][ycounter]==false)) {
		robot.go('s');
		position[xcounter+1][ycounter]=true;
		xcounter++;							
		}
		
		
		if(position[5][4]==true) { //destination
			break;
		}						
	}//while loop end		
		
		robot.say("Done");
		System.exit(0);
	    
	} //main end
} //class end
