
public class Circle
{
String m_color = null;
double m_radius = -1;

	public static void main(String[] args) 
	{
		Circle bigCircle = new Circle(90);
		System.out.println("Big circle's radius is " + bigCircle.m_radius);
		System.out.println("Big circle's radius is " + bigCircle.m_color);
		System.out.println("Big circle's area is " + bigCircle.CalculateArea());
		bigCircle.PrintColor();

		Circle smallCircle = new Circle(3, "red");
		System.out.println("Small circle's radius is " + smallCircle.m_radius);
		System.out.println("Small circle's color is " + smallCircle.m_color);

		
	}
Circle(int radius)
{
	m_radius = radius;
	m_color = "grey";
}

Circle(int radius, String color)
{
	m_radius = radius;
	m_color = color;
}

double CalculateArea()
{
	double area = 3.14 * m_radius * m_radius;
	return area;
}

void PrintColor()

{
System.out.println("My color is " + m_color);

}
}

