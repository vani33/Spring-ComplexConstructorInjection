package com.hcl;

class Complex {
	private double real;
	private double imag;
	
	public Complex() {
		
	}
	public Complex(double real, double imag) {
		this.real=real;
		this.imag=imag;
	}
	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}

	public void putValues(double r , double i) {
		this.real = r;
		this.imag = i;
		}

	 public void display() {
		 System.out.println(this.real + "+i" + this.imag);
	 }

	 public Complex add(Complex c) {

	  Complex result = new Complex();
	  result.real =this.real + c.real;
	  result.imag = this.imag + c.imag;
	  return result;

	 	}

	 }


