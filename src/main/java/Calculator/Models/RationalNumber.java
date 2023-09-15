package Calculator.Models;

public class RationalNumber extends Numbers {
    private String number;

    public RationalNumber() {
        super();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return number;
    }
}
