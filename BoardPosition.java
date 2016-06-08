import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;


public class BoardPosition extends JPanel {

	ArrayList<Player> playerList;
	int position;
	
	public BoardPosition(int size) {
		playerList = new ArrayList<Player>();
		this.setOpaque(true);
		this.setBackground(Color.black);
		this.setSize(60,60);
		
		playerList.add(new Player(0,Color.blue,0));
		playerList.add(new Player(0,Color.red,0));
		
		
	}
	
	public void paintComponent(Graphics g) {
		int size = playerList.size();
		int num = 0;
		Iterator<Player> i = playerList.iterator();
		g.setColor(Color.black);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		while (i.hasNext()) {
			Player p = i.next();
			g.setColor(p.getIcon());
			g.fillOval(10*num,this.getHeight()/2,10,10);
			num++;
		}
			
		}
	
}
