/**
*
* NCAAGui
* 		Draws the predicted progression of March Madness to the screen in bracket format
*
**/

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Graphics;

public class NCAAGui extends JFrame{
	
	/**
	*	Constructor
	*		initializes gui window 
	*
	**/
	public NCAAGui(){
		super("2013 March Madness Bracket");
		this.setSize(this.getToolkit().getScreenSize());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	/**
	*	paint
	*		draws the bracket to the screen
	*
	**/
	public void paint(Graphics g){

	}

	public static void main(String[] args){
		NCAAGui gui = new NCAAGui();
	}

}