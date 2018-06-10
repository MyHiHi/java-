package com.solar.main;

import java.awt.Graphics;
import java.sql.Time;

import com.solar.constant.Constant;
import com.solar.util.GameUtil;

public class Decorations02 extends Plant {

	double degree = 100;
	double speed;
	int r=50;
	public Decorations02(String name,double speed) {		
		image = GameUtil.getImage(Constant.IMG_PRE+name+Constant.IMG_BACK);
		this.x=Constant.GAME_WIDTH*3/4;
		this.y=Constant.GAME_HEIGHT*4/5;
		this.speed=speed;
	}
	 
	@Override
	public void move() {
		
		y = (int) (r*(1+Math.cos(degree))*Math.cos(degree))+Constant.GAME_HEIGHT/14;
		x = (int) (r*(1+Math.cos(degree))*Math.sin(degree))+Constant.GAME_WIDTH/5;
		degree +=speed;


	}
	
	@Override
	public void setString(Graphics g) {
		
	}
	
	@Override
	public void SetColor(Graphics g) {
		super.SetColor(g);
		
	}
	@Override
	public void drawTrace(Graphics g) {
		
	}
}
