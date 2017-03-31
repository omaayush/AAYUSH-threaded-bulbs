import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Applet_A.class" height=200 width=830>
</applet>
*/
public class Applet_A extends Applet implements Runnable,MouseMotionListener
{
Label l1=new Label("														");
public void mouseMoved(MouseEvent e)
{
l1.setText("Moved:- X="+e.getX()+" Y="+e.getY());
}
public void mouseDragged(MouseEvent me){}

public void init()
{	l1.setBounds(200,100,50,10);
	l1.setBackground(Color.yellow);
	add(l1);
//addMouseListener(this);
addMouseMotionListener(this);
	Thread th=new Thread(this);
	th.start();
}

public void paint(Graphics g)
{	try
	{
	for(int i=0,r=100,gr=250,b=0,y=30,x=70,xx=70,p=30;i<8;i++,x-=9,xx+=9,y+=17.32,p+=19,r-=10,gr=gr-10,b+=10)
	{
	Color c=new Color(r,gr,b);
	g.setColor(c);
	g.fillOval(x,y,20,20);
	g.fillOval(xx,y,20,20);
	if(x==25)
	g.fillOval(52,100,19,19);
	if(x==16)
	g.fillOval(70,100,19,19);
	if(x==7)
	g.fillOval(88,100,19,19);

	g.fillOval(x+160,y,20,20);
	g.fillOval(xx+160,y,20,20);
	if(x==25)
	g.fillOval(52+160,100,19,19);
	if(x==16)
	g.fillOval(70+160,100,19,19);
	if(x==7)
	g.fillOval(88+160,100,19,19);
	if(i<=4)
	{
		g.fillOval(xx+250,y,20,20);
		g.fillOval(x+322,y,20,20);
	}
	else
	{
		g.fillOval(286+70,y,19,19);
	}
	
	if(p<126)
	{
	g.fillOval(425,p,20,20);
	g.fillOval(525,p,20,20);
	}
	else if(p==144)
	{
	g.fillOval(435,p-2,20,20);
	g.fillOval(515,p-2,20,20);
	}
	else if(p==163)
	{
	g.fillOval(455,p-15,20,20);
	g.fillOval(475,p-15,20,20);
	g.fillOval(495,p-15,20,20);	
	}
	
	if(p<40)
	{
	g.fillOval(586,p+6,20,20);
	g.fillOval(585+19,p+1,20,20);
	g.fillOval(585+19*2,p,20,20);
	g.fillOval(585+19*3,p,20,20);
	g.fillOval(585+19*4,p,20,20);
	}
	else if(p==49)
	{
	g.fillOval(569,p-2,20,20);
	}
	else if(p==68)
	{
	g.fillOval(562,p-6,20,20);
	}
	else if(p==87)
	{
	g.fillOval(570,p-8,20,20);
	g.fillOval(585,90-2,20,20);
	g.fillOval(585+19,90,20,20);
	g.fillOval(585+19*2,90,20,20);
	g.fillOval(584+19*3,90,20,20);
	}
	else if(p==106)
	{
	g.fillOval(584+19*4,100-4,20,20);
	}
	else if(p==125)
	{
	g.fillOval(597+19*4,p-15,20,20);
	}
	else if(p==144)
	{
	g.fillOval(600+19*4,p-15,20,20);
	}
	else if(p==163)
	{
	g.fillOval(566,150,20,20);
	g.fillOval(585,150,20,20);
	g.fillOval(585+19,150,20,20);
	g.fillOval(585+19*2,150,20,20);
	g.fillOval(585+19*3,150-2,20,20);
	g.fillOval(585+19*4,150-9,20,20);
	}
	
	g.fillOval(705,p-(i*1),19,19);
	g.fillOval(795,p-(i*1),19,19);
	if(p==106)
		g.fillOval(723,95,19,19);
	if(p==125)
		g.fillOval(741,95,19,19);
	if(p==144)
		g.fillOval(759,95,19,19);
	if(p==163)
		g.fillOval(777,95,19,19);
	Thread.sleep(500);
	}
	}
	catch(InterruptedException e)
	{
	}
}
	public void run()
	{
		try
		{ 
			for(int i=0;i<5;i++)
			{
			Thread.sleep(3000);
			repaint();
			}
			
		}
		catch(InterruptedException e)
		{
	}
		
	}
}