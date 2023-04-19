import java.applet.*;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.Date;

public class Game extends Applet {

	private static final long serialVersionUID = 1L;
	int count = 0;
	String strTime = new String();

	public void init() {
		setSize(1000, 1000);
	}

	public void start()
	{
		Date d = new Date();
		strTime = d.toString();
		repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString("System current time: "+strTime, 20, 30);
	}

	public boolean mouseClicked(MouseEvent e)
	{
		count++;
		getAppletContext().showStatus("Hellow, you have clicked "+count+"times!");
		return true;
	}
};