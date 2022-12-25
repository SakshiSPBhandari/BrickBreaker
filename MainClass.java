package Game;

import javax.swing.*;
import java.awt.*;

public class MainClass {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		Image icon = Toolkit.getDefaultToolkit().getImage("index.jpg");
		f.setTitle("Brick Breaker");
		f.setIconImage(icon);
		f.setSize(700,600);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setResizable(false);
		
		
		GamePanel gamepanel = new GamePanel();
		f.add(gamepanel);
	}

}
