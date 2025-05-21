package asm2;

public class Fraction extends MyNumber {
    int numerator;
    int denominator;

    @Override
    public MyNumber add(MyNumber other) {
        Fraction total = new Fraction();
        Fraction o = (Fraction) other;
        total.denominator = this.denominator + o.denominator;
        total.numerator = this.numerator * o.denominator + o.numerator * this.denominator;
        return total;
    }

    @Override
    public String toString() {
        if (denominator == 1) return String.valueOf(numerator);
        return numerator + "/" + denominator;
    }

    @Override
    public MyNumber divide(MyNumber other) {
        Fraction total = new Fraction();
        Fraction o = (Fraction) other;
        if (o.numerator == 0) {
            System.out.println("Lỗi: chia cho 0");
            return null;
        }
        total.numerator = this.numerator * o.denominator;
        total.denominator = this.denominator * o.numerator;
        return total;

    }

    @Override
    public MyNumber multiply(MyNumber other) {
        Fraction total = new Fraction();
        Fraction o = (Fraction) other;
        total.numerator = this.numerator * o.numerator;
        total.denominator = this.denominator * o.denominator;
        return total;
    }

    @Override
    public MyNumber subtract(MyNumber other) {
        Fraction total = new Fraction();
        Fraction o = (Fraction) other;
        total.numerator = this.numerator * o.denominator - o.numerator * this.denominator;
        total.denominator = this.denominator * o.denominator;
        return total;
    }
    // rút gọn hàm số
     void simplify() {
        int gcd = ucln(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
    }

    // Tìm ước chung lớn nhất
     int ucln(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}