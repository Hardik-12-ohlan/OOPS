import java.util.Scanner;
class Rectangle {
	double width ,height;
	Rectangle()
	{  width =1;
	   height=1;
	}

Rectangle (double w,double h)
{ width= w;
  height=h;
}

void getArea()
{ 
	System.out.println("Area of rectangle : " +(width*height));
}

void getPerimeter()
{
 	System.out.println("Perimeter of rectangle :" +(2*(width+height)));
}

	public static void main (String args[]){
	Scanner s1= new Scanner(System.in);
	System.out.println("Enrollment number :24090107010");
	
	double a;
	System.out.println("Enter Value of a:");
	a=s1.nextDouble();

	
	double b;
	System.out.println("Enter Value of b:");
	b=s1.nextDouble();

	
	Rectangle obj1= new Rectangle();
		  obj1.getArea();
		  obj1.getPerimeter();
 		
	Rectangle obj2= new Rectangle(a,b);
		obj2.getArea();
		obj2.getPerimeter();
}
}