package com.solar.main;

import java.awt.Graphics;
import java.awt.Image;

public class Star {
	int x;
	int y;
	Image image;
	
	public void draw(Graphics g) {
		
		g.drawImage(image, x,y,null);
	}
}
