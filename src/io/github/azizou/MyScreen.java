package io.github.azizou;

import java.awt.Color;
import java.awt.Graphics2D;

public class MyScreen extends Screen{
	int x = 0;
	
	public MyScreen(ScreenFactory screenFactory) {
		super(screenFactory);
	}
	@Override
	public void onCreate(){
		System.out.println("Creating a new screen");
	}
	@Override
	public void onUpdate() {
		if(x>=800 + 64)
			x = -64;
		x++;
	}
	@Override
	public void onDraw(Graphics2D g2d) {
		g2d.setColor(Color.BLACK);
		g2d.fillRect(x, 400, 64, 64);
		g2d.setColor(Color.WHITE);
		g2d.fillRect(x, 470, 64, 64);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(x, 540, 64, 64);
	}
}
