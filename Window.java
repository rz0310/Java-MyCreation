package homeWork;

import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Window {
	Button bt1;
	Button bt2;
	static TextField name;
	static TextField pass;
	public void init()
	{
		JFrame f = new JFrame();
		f.setLocation(600, 200);
		f.setSize(300, 200);
		f.setVisible(true);
		Container c = f.getContentPane();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		Listener l1 = new Listener();
		Listener2 l2 = new Listener2();
		
		Label namep = new Label("     Name:",Label.RIGHT);
		Label passp = new Label("Password:",Label.RIGHT);
		Button bt1 = new Button("register");
		Button bt2 = new Button("exit");
		name = new TextField(10);
		pass = new TextField(10);
		pass.setEchoChar('*');
		
		c.setLayout(new GridLayout(5,1));
		c.add(p1);
		c.add(p2);
		c.add(p4);
		c.add(p3);
		p1.add(namep);
		p1.add(name);
		p2.add(passp);
		p2.add(pass);
		p3.add(bt1);
		p3.add(bt2);
		bt1.addActionListener(l1);
		bt2.addActionListener(l2);
	}
	public class Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(name.getText().equals("renjing"))
			{
				if(pass.getText().equals("19970429"))
				{
					JOptionPane.showMessageDialog(null, "µÇÂ½³É¹¦");
				}
				else {
					JOptionPane.showMessageDialog(null, "µÇÂ¼Ê§°Ü£¬ÃÜÂë´íÎó£¡");
				}
			}
			else{
				JOptionPane.showMessageDialog(null, "µÇÂ½Ê§°Ü£¬ÓÃ»§Ãû²»´æÔÚ£¡");
			}
			
		}
}
	public class Listener2 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		
	}
}
