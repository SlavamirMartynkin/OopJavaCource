package Hw4Oop;

public class Teacher extends User {
    private String objectToTeach;
    private int salary;

    public String getObjectToTeach() {
        return objectToTeach;
    }

    public void setObjectToTeach(String objectToTeach) {
        this.objectToTeach = objectToTeach;
    }

    @Override
    public String toString() {
        return "{Teacher - " + getName() +
                ", subject - " + objectToTeach + ", salary - " + getSalary() +"}";
    }

    public Teacher(String name, String objectToTeach, int salary) {
        super(name);
        this.objectToTeach = objectToTeach;
        this.salary = salary;
    }

    public Teacher(String name) {
        super(name);
    }

    public int getSalary() {
        return salary;
    }
}
