package Calculator.Models;

public abstract class Numbers {
    protected String name;
    /**
     * @apiNote принцип открытости/закрытости
     * класс закрыт для модификации, но открыт для расширения через дочерние классы ComplexNumber и RationalNumber
     * тут же работает и принцип Барбары Лисков
     * тут же работает принцип инверсии зависимостей
     */
    public Numbers() {
        this.name = name;
    }
}
