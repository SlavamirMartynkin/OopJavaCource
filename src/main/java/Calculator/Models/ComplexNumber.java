package Calculator.Models;

public class ComplexNumber extends Numbers {
    private String number;
    private String a;
    private String b;

    public ComplexNumber(String name, String a, String b) {
        super();
        this.number = a+"+"+b+"i";
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = a+"+"+b+"i";
    }

    @Override
    public String toString() {
        return number;
    }
}
