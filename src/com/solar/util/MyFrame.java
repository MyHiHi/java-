package com.solar.util;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.solar.constant.Constant;

public abstract class MyFrame extends Frame{
	
	public void loadFrame(){
		setSize(Constant.GAME_WIDTH, Constant.GAME_HEIGHT);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("my Window");
		setResizable(false);
		addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		});
		new MyThread().start();
	}
	
	class MyThread extends Thread{
		@Override
		public void run() {
			while(true){
				repaint();
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
	}

	Image backImg = null;
	@Override
	public void update(Graphics g) {
		if (backImg==null){
			backImg = createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
		}
		Graphics backg = backImg.getGraphics();
			Color c= backg.getColor();
			backg.setColor(Color.GRAY);
			backg.fillRect(0,0,Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
			backg.setColor(c);
			paint(backg);
			g.drawImage(backImg,0,0,null);
		}
	
}
