import java.awt.*;
import java.applet.*;

public class AppletTest extends Applet
{
	public void paint(Graphics g)
	{
		// the first two (0,0,)are where it starts and last two 800 600 is where it ends
		// X is on the top postive right from 0 and vice versa downwards
		// x is first is top y is down and second

	//	g.drawLine(0,0,800,600);
	//	g.drawLine(0,600,800,0);
	//	g.drawLine(100,300,700,300);
	//	g.drawLine(400,100,400,500);


	//	g.draw3DRect(100,100,50,50,true);
		g.drawRect(300,400,100,200);
		g.drawRect(500,600,100,200);







		g.drawOval(300,500,100,200);


		g.drawLine(300,400,500,600);
		g.drawLine(600,400,500,300);
// javac AppletTest.java
	//appletviewer Java0407.html
	//use arrow to find the fist comment and enter

	//comments above is what to write in the termination window

	}
}
