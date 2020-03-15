import java.applet.* ;
import java.awt.* ;

public class ShapeTest extends Applet{
	public void init()
	{
		System.out.println("Applet initialized");
	}
	public void start()
	{
		System.out.println("Applet execution started");
	}
	public void stop()
	{
		System.out.println("Applet execution stopped");
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.green) ;
		g.fillRect(4, 5, 50, 40) ;
		g.setColor(Color.orange) ;
		g.fillOval(100, 100, 70, 70);
		g.drawLine(0,0,400,400) ;
		System.out.println("Painting...");
	}
	public void destroy()
	{
		System.out.println("Applet destroyed");
	}		
}