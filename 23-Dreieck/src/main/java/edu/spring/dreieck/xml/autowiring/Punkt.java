package edu.spring.dreieck.xml.autowiring;

public class Punkt {
	private int x;
	private int y;

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Punkt [x=" + x + ", y=" + y + "]";
	}
	
}
