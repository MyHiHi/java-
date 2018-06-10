package com.solar.main;

import java.awt.Graphics;

public class XiaoXingXing extends Plant{
	public XiaoXingXing(Star center,String name,String starName,double distance,double e,int days){
		super(center, name, starName, distance, e, days);
		this.speed = this.getSpeedByDays(days)*Math.random();
	}
	@Override
	public void draw(Graphics g) {
		g.fillOval(x, y, 5, 5);
		move();
	}
}
