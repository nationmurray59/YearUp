
public class CalculateArea {

	private static double rectangleAreaInMainMethod;

	public static void main(String[] args) 
	{
	double circleAreaInMainMethod = CalculateCircleArea(10);	
	System.out.println("Area of the circle is " + circleAreaInMainMethod);
	double rectangleAreaInMainMethod = AreaRect (8,3);
	System.out.println("Area of the rectangle is " + rectangleAreaInMainMethod);
	
	}
		// TODO Auto-generated method stub

	

	public static double CalculateCircleArea(int radius)
	{
//This method calculates the area of a circle
		//Input:  integer radius value
		//Output: double area
		
		double area = 3.14 * radius * radius;
		return area;
} 
	
		public static double AreaRect(int width, int length){
		
		double area= length * width;
		return area;
	}
	
	}

