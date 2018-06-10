package com.solar.main;

import java.awt.Graphics;
import java.awt.Image;

import com.solar.constant.Constant;
import com.solar.util.GameUtil;

public class Decorations01 extends Plant{
	
	
	public int horDistance;
	boolean right ;
	public Decorations01(String name,int speed,boolean right) {		
		image = GameUtil.getImage(Constant.IMG_PRE+name+Constant.IMG_BACK);
		if (right){
			y=20;
			this.x=10;
		}else{
			y=Constant.GAME_HEIGHT-300;
			x = Constant.GAME_WIDTH-200;
		}
//		this.x=10;
//		this.y=40;
		this.right = right;
		horDistance=speed;
	}
	 
	
	@Override
	public void move() {
		if (right){
			x+=horDistance;
			
		}else{
			x-=horDistance;
		}
		if (x>=Constant.GAME_WIDTH-image.getWidth(null)){
			right=false;	
		}
		if (x<=0){
			right=true;	
		}
		
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
