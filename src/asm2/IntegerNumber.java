package asm2;

public class IntegerNumber extends MyNumber {
    int value;

    @Override
    public MyNumber add(MyNumber other) {
        IntegerNumber total = new IntegerNumber();
        IntegerNumber o = (IntegerNumber) other;
        total.value = this.value + o.value;
        return total;
    }

    @Override
    public MyNumber subtract(MyNumber other) {
        IntegerNumber total = new IntegerNumber();
        IntegerNumber o = (IntegerNumber) other;
        total.value = this.value - o.value;
        return total;
    }

    @Override
    public MyNumber multiply(MyNumber other) {
        IntegerNumber total = new IntegerNumber();
        IntegerNumber o = (IntegerNumber) other;
        total.value = this.value * o.value;
        return total;
    }

    @Override
    public MyNumber divide(MyNumber other) {
        IntegerNumber total = new IntegerNumber();
        IntegerNumber o = (IntegerNumber) other;
        if (o.value == 0) {
            System.out.println("Lỗi: Chia cho 0");
            return null;
        }
        total.value = this.value / o.value;
        return total;
    }


    @Override
    public String toString() {
        return String.valueOf(value);
    }
}