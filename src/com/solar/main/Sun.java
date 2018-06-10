package com.solar.main;

import java.awt.Graphics;
import java.awt.Image;

import com.solar.constant.Constant;
import com.solar.util.GameUtil;
public class Sun extends Star{
	
	public Sun(String name) {
		String sunPath = Constant.IMG_PRE+name+Constant.IMG_BACK;
		image = GameUtil.getImage(sunPath); //?
		this.x = Constant.GAME_WIDTH/2 - image.getWidth(null)/2;
		this.y = Constant.GAME_HEIGHT/2 - image.getHeight(null)/2;
		
	}
	

	
}