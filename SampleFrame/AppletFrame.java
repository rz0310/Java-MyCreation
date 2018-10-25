package homework;

import java.applet.Applet;
import java.awt.Frame;
import java.awt.Graphics;

public class AppletFrame extends Applet {
	Frame f;
	public void init()
	{
		f = new SampleFrame("A Frame Window");
		f.setSize(250, 250);
		f.setVisible(true);
	}
	public void start()
	{
		f.setVisible(true);
	}
	public void stop()
	{
		f.setVisible(false);
	}
	public void paint(Graphics g)
	{
		g.drawString("图书管理系统", 10, 20);
	}
}
