package snake;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

 public class KeyboardListener extends KeyAdapter{
 	
 		public void keyPressed(KeyEvent e){
 		    switch(e.getKeyCode()){
		    	case 39:	// -> Right 
		    				//if it's not the opposite direction
		    				if(ThreadController.directionSnake!=2) 
		    					ThreadController.directionSnake=1;
		    			  	break;
		    	case 38:	// -> Top
							if(ThreadController.directionSnake!=4) 
								ThreadController.directionSnake=3;
		    				break;
		    				
		    	case 37: 	// -> Left 
							if(ThreadController.directionSnake!=1)
								ThreadController.directionSnake=2;
		    				break;
		    				
		    	case 40:	// -> Bottom
							if(ThreadController.directionSnake!=3)
								ThreadController.directionSnake=4;
		    				break;
		    	
		    	default: 	break;
 		    }
 		}
 	
 }


