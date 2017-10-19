import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JButtonTest extends JFrame{
	public JButtonTest(){
		URL url=JButtonTest.class.getResource("imageButtoo.jpg");
		Icon icon=new ImageIcon(url);
		setLayout(new GridLayout(3,2,5,5));
		Container c=getContentPane();
		for(int i=1;i<=5;i++){
			
			JButton J=new JButton("按钮"+i,icon);
			c.add(J);
			if(i%2==0){
				J.setEnabled(false);
			}
		}
		JButton jb=new JButton();
		jb.setMaximumSize(new Dimension(90,30));
		jb.setIcon(icon);
		jb.setHideActionText(true);
		jb.setToolTipText("图片按钮");
		jb.setBorderPainted(false);
		c.add(jb);
		setTitle("创建带文字与图片的按钮");
		setSize(350,150);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String args[]){
		new JButtonTest();
	}

}
