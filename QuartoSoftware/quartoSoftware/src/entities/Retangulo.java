package entities;

public class Retangulo {
	public double width;
	public double height;
	
	public double area() {
		return this.height * this.width;
	}
	
	public double perimetro() {
		return 2 * (this.height + this.width);
	}
	
	public double diagonal() {
		return Math.sqrt(this.height * this.height + this.width * this.width);
	}
}
