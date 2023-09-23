package ComplexCalculatorHW7.Service;

public class Calculate implements Calcuable {
    int a1;
    int a2;
    int b1;
    int b2;
    String res;

    public Calculate(int a1, int a2, int b1, int b2) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
    }

    public Calculate() {
    }
    @Override
    public String summ(int a1, int a2, int b1, int b2) {
        return res = (a1+b1) + "+" + (a2+b2) + "i";
    }

    @Override
    public String dif(int a1, int a2, int b1, int b2) {
        return res = (a1-b1) + "+" + (a2-b2) + "i";
    }

    @Override
    public String mult(int a1, int a2, int b1, int b2) {
        int x = a1*b1 - a2*b2;
        int y = a1*b2 + a2*b1;
        return res = x + "+" + y + "i";
    }

    @Override
    public String dev(int a1, int a2, int b1, int b2) {
        int x = (a1*b1 + a2*b2) / (b1*b1 + b2*b2);
        int y = (b1*a2 - a1*b2) / (b1*b1 + b2*b2);
        return res = x + "+" + y + "i";
    }

    @Override
    public String toString() {
        return res;
    }
}
