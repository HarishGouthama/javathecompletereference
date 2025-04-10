package com.chapter13IOappletsandothertopics.programs;

import java.applet.Applet;
import java.awt.Graphics;

public class SimpleApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("A Simple Applet" , 20 , 20);
	}
}
