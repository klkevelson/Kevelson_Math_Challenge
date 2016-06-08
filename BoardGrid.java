import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class BoardGrid extends JPanel {

	ArrayList<BoardPosition> positionList = new ArrayList<BoardPosition>();
	
	public BoardGrid() {
		this.setSize(new Dimension(600,600));
		GridLayout gLayout = new GridLayout(10, 10);
		gLayout.setHgap(5);
		gLayout.setVgap(5);
		this.setLayout(gLayout);
		this.setSize(this.getMaximumSize());
		
//		for (int i = 0; i < 20; i++) {
		
//		}
	/***
	 * come up with a mapping function to map the board position to the grid position
	 *
	 */
		
		for (int i = 0; i< 10; i++) {
			for (int j=0; j<10; j++) {
				if (j==0 || i == 0 || j==9) {
					int bpSize = this.getHeight()/10;
					
					BoardPosition bp = new BoardPosition(bpSize);
					System.out.println(bpSize);
					positionList.add(bp);
					this.add(bp);
				} else if (j ==1 && i == 9) {
					JPanel startPanel = new JPanel();
					JLabel startLabel = new JLabel("Start Here");
					startPanel.add(startLabel);
					this.add(startPanel);
				
				} else if (j == 8 && i == 9) {
					JPanel endPanel = new JPanel();
					JLabel endLabel = new JLabel("End Here");
					endPanel.add(endLabel);
					this.add(endPanel);
				}
				else {
					this.add(new JPanel());
				}
			}
		}
		
		
		
	}
	
}
