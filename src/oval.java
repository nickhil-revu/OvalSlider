import javax.swing.*;
import java.awt.*;


public class oval extends JPanel{
	
	private int d=10;
	private int h=10;
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.fillOval(10, 10, d, h);
		
	}
	public void setD(int newD){
		d=(newD>=0?newD:10);
		repaint();
	}
	public void setH(int newH){
		h=newH;
		repaint();
	}
	
	public Dimension getPrefferedSize(){
		return new Dimension(200,200);
	}
	public Dimension getMinimumSize(){
		return getPrefferedSize();
	}
	
	

}
