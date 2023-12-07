package by.edu.training.lesson12;

public class Triangle {

	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle(Point p1, Point p2, Point p3) {

		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}

	public double getSquare() {
		double square1 = p1.distance(p2);
		double square2 = p2.distance(p3);
		double square3 = p3.distance(p1);

		double perimeter = (square1 + square2 + square3) / 2;

		return Math.sqrt(perimeter * (perimeter - square1) * (perimeter - square2) * (perimeter - square3));
	}

	public double getPerimeter() {
		double perimeter1 = p1.distance(p2);
		double perimeter2 = p2.distance(p3);
		double perimeter3 = p3.distance(p1);

		return perimeter1 + perimeter2 + perimeter3;
	}

	public Point getMedian() {
		double x = (p1.getX() + p2.getX() + p3.getX()) / 3;
		double y = (p1.getY() + p2.getY() + p3.getY()) / 3;

		return new Point(x, y);
	}
}
