import javax.swing.JFrame;
import javax.swing.JSplitPane;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;


public class Expand extends JFrame{
	public static void main(String[]args){
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Expand frame = new Expand();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		
		
	
	public Expand() {
		getContentPane().setLayout(null);
		setSize(600,633);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(9, 16, 554, 546);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setOneTouchExpandable(true);
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_2.setBounds(15, 47, 524, 483);
		panel.add(splitPane_2);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_2.setLeftComponent(splitPane_1);
		splitPane_1.setOneTouchExpandable(true);
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOneTouchExpandable(true);
		splitPane.setContinuousLayout(true);
		splitPane.setToolTipText("");
		splitPane_1.setLeftComponent(splitPane);
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
	}
}
