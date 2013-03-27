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
	* paint
	*		draws the bracket to the screen
	*
	* @param g - Graphics object
	*
	**/
	public void paint(Graphics g){
		drawBracket(g);
	}

	/**
	*	main
	*		initializes a gui object
	*
	**/
	public static void main(String[] args){
		NCAAGui gui = new NCAAGui();
	}

	/**
	*
	* drawBracket
	*		gets info about the JFrame window to begin drawing the bracket
	*
	* @param g - Graphics object
	*
	*
	**/
	public void drawBracket(Graphics g){
		int centerShift = 10;
		int winHeight = (int)(this.getToolkit().getScreenSize().getHeight());
		int winWidth = (int)(this.getToolkit().getScreenSize().getWidth());
		int centerX = winWidth/2;
		int centerY = winHeight/2;

		int horizLineLength = winWidth/12 - 15;
		int vertLineLength = winHeight/8 - 5;
		int lineStartHeight = centerY;
		int lineStartWidth = centerX;
	
		//draws the 4 regions
		drawLines(g, centerY/2 + 25, centerX - 130, horizLineLength, vertLineLength, 5);
		drawLines(g, centerY + 195, centerX - 130, horizLineLength, vertLineLength, 5);
		drawLines(g, centerY/2 + 25, centerX + 130, -horizLineLength, vertLineLength, 5);
		drawLines(g, centerY + 195, centerX + 130, -horizLineLength, vertLineLength, 5);

		//draws the center bracket
		g.drawLine(centerX, centerY, centerX - 130, centerY);
		g.drawLine(centerX, centerY, centerX + 130, centerY);
		g.drawLine(centerX + 130, centerY, centerX + 130, centerY/2+25);
		g.drawLine(centerX + 130, centerY, centerX + 130, centerY + 195);
		g.drawLine(centerX - 130, centerY, centerX - 130, centerY/2 + 25);
		g.drawLine(centerX - 130, centerY, centerX - 130, centerY+195);
	}

	/**
	*
	* drawLines
	*	draws the lines of the bracket on the screen recursively
	* 
	* @param g - Graphics object
	* @param lineY - the y position of the right-most point of the line
	* @param lineX - the x position of the right-most point of the line
	* @param horizLineLength - required length of each of the horizontal lines
	* @param vertLineLength = required length of each of the vertical lines
	* @param counter - the depth of the bracket
	*
	* @return int;
	*
	**/
	public void drawLines(Graphics g, int lineY, int lineX, int horizLineLength, int vertLineLength, int counter){
		//base case
		if(counter <= 0){
			return;
		}

		//draw step
		g.drawLine(lineX, lineY, lineX - horizLineLength, lineY);
		g.drawLine(lineX - horizLineLength, lineY, lineX - horizLineLength, lineY + vertLineLength);
		g.drawLine(lineX - horizLineLength, lineY, lineX - horizLineLength, lineY - vertLineLength);

		//recursive step
		drawLines(g, lineY + vertLineLength, lineX - horizLineLength, horizLineLength, vertLineLength/2, counter-1);
		drawLines(g, lineY - vertLineLength, lineX - horizLineLength, horizLineLength, vertLineLength/2, counter-1);

	}

}