package com.solar.main;

import java.awt.Color;
import java.awt.Graphics;

import com.solar.constant.Constant;
import com.solar.util.GameUtil;

public class Plant extends Star {
	int longAxis,shortAxis;
	double degree,speed;
	String plantName;
	Star center;
	public Plant() {}
	public Plant(Star center,String name,String starName,double distance,double e,int days) {
		this.center = center;
		this.plantName = name;
		this.image = GameUtil.getImage(Constant.IMG_PRE+starName+Constant.IMG_BACK);
		this.longAxis = getLongAxisByDiatance(distance);
		this.shortAxis = getShortAxisByE(e);
		this.x = center.x+longAxis;
		this.y = center.y;
		this.speed = getSpeedByDays(days);
	}
	public double getSpeedByDays(int days) {
		return 0.1*365/days;
	}
	public int getShortAxisByE(double e) {
		return (int) (this.longAxis*Math.sqrt(1-e*e)/3);
	}
	public int getLongAxisByDiatance(double distance) {
		
		return (int) (34*distance);
	}
	
	
//	public int getDiff(){
//		return center.image.getWidth(null)-this.image.getWidth(null);
//	}
//	
	
	@Override
	public void draw(Graphics g) {
		
		super.draw(g);
		SetColor(g);
		drawTrace(g);
		setString(g);
		move();
	}
	
	public void SetColor(Graphics g){
		g.setColor(Color.WHITE);
	}
	public void setString(Graphics g){
		g.drawString(plantName, x, y);
	}
	
	public void drawTrace(Graphics g){
		int x = center.x - this.longAxis ;
		int y = center.y - this.shortAxis;
		int width = 2*longAxis;
		int height = 2*shortAxis;
		
		g.drawOval(x, y, width, height);
	}
	
	
	
	public void move(){
		x = (int) (center.x + this.longAxis*Math.cos(degree)-image.getWidth(null)/2);
		y = (int) (center.y + this.shortAxis*Math.sin(degree)-image.getHeight(null)/2);
		degree += speed;
	}
	

}
