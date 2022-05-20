package oop_part1.complex_operations;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexA){
        add(complexA.getReal(), complexA.getImaginary());
    }

    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber complexA){
        subtract(complexA.getReal(), complexA.getImaginary());
    }
}
