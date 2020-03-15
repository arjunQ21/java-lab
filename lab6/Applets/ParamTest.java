import java.applet.* ;
import java.awt.Graphics ;

public class ParamTest extends Applet{
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
		g.drawString(getParameter("msg"), 70, 70);
		System.out.println("Painting...");
	}
	public void destroy()
	{
		System.out.println("Applet destroyed");
	}		
}