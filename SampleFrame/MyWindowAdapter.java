package homework;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyWindowAdapter extends WindowAdapter {
	SampleFrame sampleFrame;
	public MyWindowAdapter(SampleFrame simpleFrame){
		this.sampleFrame=simpleFrame;
	}
	public void WindowClosing(WindowEvent we)
	{
		sampleFrame.setVisible(false);
	}
}
