package com.osgo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware
{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	

	public Point getPointA()
	{
		return pointA;
	} // end method getPointA


	public void setPointA(Point pointA)
	{
		this.pointA = pointA;
	} // end method setPointA


	public Point getPointB()
	{
		return pointB;
	} // end method getPointB


	public void setPointB(Point pointB)
	{
		this.pointB = pointB;
	} // end method setPointB


	public Point getPointC()
	{
		return pointC;
	} // end method getPointC


	public void setPointC(Point pointC)
	{
		this.pointC = pointC;
	} // end method setPointC
	
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException
	{
		this.context = context;
	} // end method setApplicationContext
	
	@Override
	public void setBeanName(String beanName)
	{
		System.out.println("Bean Name is: " + beanName);

	} // end method setBeanName
	
	public void draw()
	{
		System.out.println("Point A = (" + getPointA().getX() + "," + getPointA().getY() + ")");
		System.out.println("Point B = (" + getPointB().getX() + "," + getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + "," + getPointC().getY() + ")");
		
	} // end method draw()
	
} // end Class Triangle
