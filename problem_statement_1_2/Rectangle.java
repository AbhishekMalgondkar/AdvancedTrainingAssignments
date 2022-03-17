package problem_statement_1_2;

public class Rectangle {

	private double length , breadth;
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	Rectangle(){
		length = 0;
		breadth = 0;
	}

	Rectangle(double length , double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	void getArea(){
		System.out.println("Length of the rectangle is : "+ length);
		System.out.println("Breadth of the rectangle is : "+ breadth);
		System.out.println("Perimeter of the rectangle is : "+ (2*(length+breadth)));
		System.out.println("Area of the rectangle is : "+ (length*breadth));
	}

}
