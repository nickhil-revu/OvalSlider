import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Window extends JFrame {

		private JSlider slider,slider1;
		private oval myPanel;
		public Window(){
			super("The Title");
			myPanel = new oval();
			myPanel.setBackground(Color.green);
			slider= new JSlider(SwingConstants.HORIZONTAL,0,200,10);
			slider.setMajorTickSpacing(10);
			slider.setPaintTicks(true);
			
			slider1= new JSlider(SwingConstants.VERTICAL,0,400,0);
			slider1.setMajorTickSpacing(10);
			slider1.setPaintTicks(true);			
			
			slider.addChangeListener(
					new ChangeListener(){
						public void stateChanged(ChangeEvent e){
							myPanel.setD(slider.getValue());
						}
					});
			
			
			slider1.addChangeListener( 
					new ChangeListener(){
						public void stateChanged(ChangeEvent e){
							myPanel.setH(slider1.getValue());
						}
					});
			add(slider1,BorderLayout.EAST);
			add(slider,BorderLayout.SOUTH);
			add(myPanel,BorderLayout.CENTER);
						
		}
}
