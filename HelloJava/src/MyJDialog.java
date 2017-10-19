import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyJDialog extends JDialog{
	public MyJDialog(){
		super(new MyFrame(),"第一个JDialog窗体",true);
		Container container=getContentPane();
		container.add(new JLabel("这是一个对话框"));
		setSize(100,100);
	}
	public static void main(String args[]){
		new MyJDialog();
	}

}
class MyFrame extends JFrame{
	public MyFrame(){
		Container container=getContentPane();
		container.setLayout(null);
		JLabel jl=new JLabel("这是一个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl=new JButton("弹出对话框");
		bl.setBounds(10, 10, 100, 21);
		bl.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new MyJDialog().setVisible(true);
			}
		});
		container.add(bl);
	}
}
