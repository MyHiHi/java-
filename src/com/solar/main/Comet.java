package com.solar.main;

import java.awt.Graphics;

import com.solar.constant.Constant;
import com.solar.util.GameUtil;

public class Comet extends Plant {
	
	Star centerR=new Star();
	public Comet(){}
	
	public Comet(Star center,String name,String starName,double distance,double e,int days){

		super(center, name, starName, distance, e, days);
	}
	
	public int getDiff(){
		return center.image.getWidth(null)-this.image.getWidth(null);
	}
	public int getDiffByAxis(){
		return (int) (Math.sqrt(this.longAxis*this.longAxis-this.shortAxis*this.shortAxis));
	}
	
	@Override
	public void move() {
		x = (int) (center.x +getDiffByAxis()+this.longAxis*Math.cos(degree)-image.getWidth(null)/2);
		y = this.center.y;
		degree += speed;
	}
	
	@Override
	public void drawTrace(Graphics g) {
		
//		int x = center.x+  this.longAxis+getDiffByAxis();
		int x = center.x-  this.longAxis+getDiffByAxis();
//		int y = center.y - this.shortAxis;
		int y = center.y - this.shortAxis;
		int width = 2*longAxis;
		int height = 2*shortAxis;
		
		g.drawOval(x, y, width, height);
	}

}
