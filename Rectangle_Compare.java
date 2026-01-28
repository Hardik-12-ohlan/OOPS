class Rectangle_Compare{
	double width,height;

	Rectangle_Compare(double w, double h)
	{
		width = w;
		height = h;
	}	
	
	double getArea()
	{
		return width * height;
	}
	
	double getPerimeter()
	{
		return 2*(width+height);
	}

	public static void main(String args[])
	{
		Rectangle_Compare obj1 = new Rectangle_Compare(4,40);
		Rectangle_Compare obj2 = new Rectangle_Compare(3.5,35.9);
		
		System.out.println("Rectangle 1:");
        	System.out.println("Width = " + obj1.width);
        	System.out.println("Height = " + obj1.height);
        	System.out.println("Area = " + obj1.getArea());
        	System.out.println("Perimeter = " + obj1.getPerimeter());

        	System.out.println();

        	System.out.println("Rectangle 2:");
        	System.out.println("Width = " + obj2.width);
        	System.out.println("Height = " + obj2.height);
        	System.out.println("Area = " + obj2.getArea());
        	System.out.println("Perimeter = " + obj2.getPerimeter());

		if(obj1.getArea()>obj2.getArea())
		{
			System.out.println("\nRectangle 1 has large Area");
		}
		else
		{
			System.out.println("\nRectangle 2 has large Area");
		}
	}

}