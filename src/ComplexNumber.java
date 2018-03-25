public class ComplexNumber implements Runnable{
    private double imaginaryPart;
    private double realPart;

    public ComplexNumber() {
        imaginaryPart = 0;
        realPart = 0;
    }

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber(ComplexNumber acomplexNumber) {
        this.imaginaryPart = acomplexNumber.imaginaryPart;
        this.realPart= acomplexNumber.realPart;
    }

    public ComplexNumber add(ComplexNumber aComplexNumber) {
        double realSum;
        double imaginarySum;
        realSum = this.realPart + aComplexNumber.realPart;
        imaginarySum = this.imaginaryPart + aComplexNumber.imaginaryPart;
        aComplexNumber.realPart = realSum;
        aComplexNumber.imaginaryPart = imaginarySum;
        return aComplexNumber;
    }

    public ComplexNumber subtract(ComplexNumber aComplexNumber) {
        double realSum;
        double imaginarySum;
        realSum = this.realPart - aComplexNumber.realPart;
        imaginarySum = this.imaginaryPart - aComplexNumber.imaginaryPart;
        aComplexNumber.realPart = realSum;
        aComplexNumber.imaginaryPart = imaginarySum;
        return aComplexNumber;
    }

    public ComplexNumber multiply(ComplexNumber aComplexNumber) {
        double realSum;
        double imaginarySum;
        realSum = aComplexNumber.realPart * this.realPart - this.imaginaryPart * aComplexNumber.imaginaryPart;
        imaginarySum = this.imaginaryPart * aComplexNumber.realPart + this.realPart * aComplexNumber.imaginaryPart;
        aComplexNumber.realPart = realSum;
        aComplexNumber.imaginaryPart = imaginarySum;
        return aComplexNumber;
    }

    public ComplexNumber divide(ComplexNumber aComplexNumber) {

    }
    @Override
    public void run() {

    }
}
