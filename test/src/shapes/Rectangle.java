package shapes;

public class Rectangle extends Shape {

	private int height;
	private int width;
	
	public Rectangle(int h, int w) {
		
		//super();
		setNumOfSides(4); 
		setHeight(h);
		setWidth(w);
		
	}
	

	@Override
	public void draw() {
		System.out.println("Draw rec");
		
	}

	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calculatePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
