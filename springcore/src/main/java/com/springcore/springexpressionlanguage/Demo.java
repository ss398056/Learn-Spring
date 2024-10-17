package com.springcore.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	@Value("#{22+6}")		//set expression/value 
	private int x;
	@Value("#{45*8-3}")		//set expression/value
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")			//passing static method in value annotation 
	private int z;
	
	@Value("#{T(java.lang.Math).PI}")				//passing static variable
	private double e;
	
	@Value("#T(java.lang.String('Sandeep Singh'))")		//passing object
	private String name;
	
	@Value("#{8>4}")								//passing boolean
	private boolean b;
	
	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", b=" + b + "]";
	}

	

	

	

	
	
	

}
