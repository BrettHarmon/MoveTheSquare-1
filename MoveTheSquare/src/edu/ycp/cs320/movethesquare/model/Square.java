package edu.ycp.cs320.movethesquare.model;

import java.awt.Color;

public class Square {
	private double x, y, width, height;
	private Color color;
	
	public Square() {
		
	}
	
	public Color changeColor() {
		this.color = new Color((float)Math.random(), (float)Math.random(), (float)Math.random()); 
		return this.color;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getX() {
		return x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public double getY() {
		return y;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
}
