import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class BoardPanel extends JPanel implements ActionListener{
	BufferedImage image, image1;
	
	JLabel label1, CircleToken;
	JButton start_button;
	JTextArea Score, QuestionsRight, QuestionsWrong;
	public BoardPanel() {
		JPanel topPanel = new JPanel();
		label1 = new JLabel("Players Start in Lower Left");
//		CircleToken = new JLabel();
		start_button = new JButton("Start to Begin");
		this.setLayout(new BorderLayout());
		//label1.setLocation(200,550);
		topPanel.add(label1);
//		start_button.setLocation(200, 300);
		topPanel.add(start_button);
		
//		CircleToken.setIcon(new ImageIcon("C:\Program Files\Java\GUI_Gen\Board\Images\CircleToken.png"));
//		add(CircleToken);
//		CircleToken.setLocation(100, 500);
		this.setOpaque(true);
		this.setBackground(Color.red);
		this.add(topPanel, BorderLayout.NORTH);
		
		this.add(new BoardGrid(), BorderLayout.CENTER);
		
		this.setSize(600,600);
	}


	public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
	}
		
		
		
}
	
	
	

