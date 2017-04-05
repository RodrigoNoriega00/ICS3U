package noriegaMestanza;

import java.awt.Color;

import hsa_new.Console;

public class HelloConsole {

	public static void main(String[] args) {
		Console c= new Console();
		c.setColor(Color.RED);
		c.println("Hello");
		c.drawOval(100,110,70,70);
		c.drawOval(10,180,90,20);
		c.drawOval(150,150,100,160);
		
		
	}
}
