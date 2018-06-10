package com.solar.main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.geom.AffineTransform;

import com.solar.constant.Constant;
import com.solar.util.GameUtil;
import com.solar.util.MyFrame;

public class SolarClient extends MyFrame{

	static Sun sun = new Sun("Sun");
	Comet comet = new Comet(sun, "彗星", "Sun",35.1, 0.967, 27485);
	Plant mercury = new Plant(sun, "水星", "Mercury", 0.38, 0.2056, 88);
	Plant earth = new Plant(sun, "地球", "Earth", 1, 0.0167, 365);
	Plant jupiter = new Plant(sun, "木星", "Jupiter", 1.52,0.0489, 4333);
	Plant mars = new Plant(sun, "火星", "Mars", 1.52,  0.0933, 687);
	Plant neptune = new Plant(sun, "海王星", "Neptune", 30.06, 0.0011, 60188);
	Plant saturn = new Plant(sun, "土星", "Saturn", 9.54, 0.0539,10760);
	Plant venus = new Plant(sun, "金星", "Venus", 0.72, 0.0068, 225);
	Plant uranus = new Plant(sun, "天王星", "Uranus", 19.218, 0.0432, 30799);
	Decorations01 decor01 = new Decorations01("Sun", 9,true);
	Decorations01 decor02 = new Decorations01("Mars", 12,true);
	Decorations01 decor03 = new Decorations01("Mercury", 6,false);
	Decorations01 decor04 = new Decorations01("Yue", 7,false);
	Decorations01 decor05 = new Decorations01("Star01", 8,true);
	Decorations01 decor06 = new Decorations01("Star02", 11,true);
	Decorations01 decor07 = new Decorations01("Star01", 15,false);
	Decorations01 decor08 = new Decorations01("Star02", 5,false);
	Decorations02 love = new Decorations02("Love",0.2);
	
	static List<XiaoXingXing> xs=new ArrayList<XiaoXingXing>();
	static Random r = new Random();
	static {
		
		for (int i=0;i<500;i++){
			double max=  7.6;
			double min = 4.6;
			BigDecimal db = new BigDecimal(Math.random()*(max-min)+min);
			double r = db.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
			XiaoXingXing xiao = new XiaoXingXing(sun, "", "Sun", r, 0.0500, 2200);
			xs.add(xiao);
		}
	}
//	Plant weixin = new Plant(saturn, "天王星", "sun", 2, 0.0432, 99);
	@Override
	public void loadFrame() {
		super.loadFrame();
		setTitle("太阳系");
	}
	
	

	String bgPath = Constant.IMG_PRE+"bg.png";
	@Override
	public void paint(Graphics g) {
		g.drawImage(GameUtil.getImage(bgPath),0,0,null);
		Graphics2D g2d=(Graphics2D)g;
		g2d.rotate(Math.toRadians(15));
//		g2d.rotate(-Math.PI/11,1.4,2.6);
//		g2d.rotate(theta, x, y);
		
//		g2d.fillRect(10, 0, 400, 400);
//		g2d.rotate(0.3, 20,20);
//		AffineTransform at = new AffineTransform();
//		at.translate(30, 40);
//		g2d.rotate(Math.toRadians(-2));
//		at.translate(-30,-40);

		
		
		sun.draw(g);
		mercury.draw(g);
		earth.draw(g);
		jupiter.draw(g);
		mars.draw(g);
		neptune.draw(g);
		saturn.draw(g);
		venus.draw(g);
		uranus.draw(g);
		comet.draw(g);
		decor01.draw(g);
		decor02.draw(g);
		decor03.draw(g);
		decor04.draw(g);
		decor05.draw(g);
		decor06.draw(g);
		decor07.draw(g);
		decor08.draw(g);
		love.draw(g);
		
		for (XiaoXingXing i : xs){
			i.draw(g);
		}
	}
	

	public static void main(String[] args) {
		new SolarClient().loadFrame();
	}
}
