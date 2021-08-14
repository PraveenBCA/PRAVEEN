package assignment;

import java.util.*;

class Calculator {
	int a,b;
	float c;
	double d;
	public void add(int num1, int num2, int num3)
	{
		a= num1+num2+num3;
		System.out.println("additon: "+a);
	}

    public void sub(int num1, int num2)
    {
		b= num1-num2;
		System.out.println("subraction: "+b);
	}
	
    public void mul(double num1,double num2)
    {
		c= (float) (num1*num2);
		System.out.println("product: "+c);
	}
    
    public void divide(float e,float f)
    {
		d= e/f;
	    System.out.println("division: "+d);
	}
    
    public static void main(String[] args) {

    	Calculator cal= new Calculator();
    	cal.add(99,99,99);
    	cal.sub(99,89);
    	cal.mul(4.8,120);
    	cal.divide(100,10);
	}
} 