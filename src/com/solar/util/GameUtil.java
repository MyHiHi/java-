package com.solar.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;



public class GameUtil {
	public static Image getImage(String path){
		BufferedImage image = null;
		URL url  = GameUtil.class.getClassLoader().getResource(path);
		try {
			image = ImageIO.read(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return image;
	}
	
	

}
