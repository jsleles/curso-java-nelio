package entities;

public class Rectangle {
	
	public double width;
	public double heigth;
	
	public double Area() {
		return this.width * this.heigth;
	}
	
	public double Perimeter() {
		return 2 * (this.width + this.heigth);
	}
	
	public double Diagonal() {
		return  Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2));
		
	}
}
