package snake;
import java.awt.*;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import java.awt.*;

public class Window extends JFrame{
	private static final long serialVersionUID = -2542001418764869760L;
	public static ArrayList<ArrayList<DataOfSquare>> Grid;
	public static int  width = 20;
	public static int height = 20;
	
	public Window(){
		//creates the arrayList tht'll contain threads
		Grid = new ArrayList<ArrayList<DataOfSquare>>();
		ArrayList<DataOfSquare> data;
		for (int i = 0; i<width; i++) {
			data = new ArrayList<DataOfSquare>();
			for(int j=0;j<height;j++){
				DataOfSquare c = new DataOfSquare(2);
				data.add(c);
			}
			Grid.add(data);
		}
		getContentPane().setLayout(new GridLayout(20,20,0,0));
		// Start & pauses all threads, then adds every square of each thread to the panel
		for(int i=0; i<width; i++) {
			for(int j=0; j<height;j++) {
				getContentPane().add(Grid.get(i).get(j).square);
				
			}
		}
		//intial the position of snake
		Tuple Position = new Tuple(10,10);
		//passing this value to controller
		ThreadController c = new ThreadController(Position);
		// start the game
		c.start();
		this.addKeyListener((KeyListener) new KeyboardListener());

		
	}
	


}
