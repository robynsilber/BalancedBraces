package testTool;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Gui extends JFrame {
	public Gui() {
		setTitle("Test Brace Balance");
		setSize(600, 500);
		setLocation(100, 200);
		
		addWindowListener(new WindowAdapter() {
			public void windowclosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		// Add Panels
				Container contentPane = getContentPane();
				//contentPane.add(new TextPanel());
				contentPane.add(new FileChooser());
	}
}

@SuppressWarnings("serial")
class TextPanel extends JPanel {
	  // override the paintComponent method
	  // THE MAIN DEMO OF THIS EXAMPLE:
	
	  @SuppressWarnings("unused")
	public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    Font f = new Font("SansSerif", Font.BOLD, 14);
	    Font fi = new Font("SansSerif", Font.BOLD + Font.ITALIC, 14);
	    FontMetrics fm = g.getFontMetrics(f);
	    FontMetrics fim = g.getFontMetrics(fi);
	    int cx = 75; int cy = 100;
	    g.setFont(f);
	    g.drawString("Hello, ", cx, cy);
	    cx += fm.stringWidth("Hello, ");
	    g.setFont(fi);
	    g.drawString("World!", cx, cy);
	  } //paintComponent
}
