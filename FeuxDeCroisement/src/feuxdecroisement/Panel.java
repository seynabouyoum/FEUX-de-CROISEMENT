/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feuxdecroisement;
import java.awt.Color;
/**
 *
 * @author youmzeyna
 */import java.awt.Graphics;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JComponent;

public class Panel extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public void paintComponent (Graphics g) {
	
		
		try {
			Image image = ImageIO.read(new File("resource/FEUvert.jpg"));
			g.drawImage(image, 0, 0, getWidth(), getHeight(),this);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		//Font font =new Font("Arial",Font.ITALIC,40);
		//g.setFont(font);
		g.setColor(Color.WHITE);
		//g.drawString("Application De Gestion de BANQUE", 10, 30);
	
	}

}

