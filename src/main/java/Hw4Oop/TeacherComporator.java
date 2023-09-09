package Hw4Oop;

import java.util.Comparator;

public class TeacherComporator <T extends Teacher> implements Comparator<T> {
    @Override
    public int compare(T teacher1, T teacher2) {
        return teacher1.getSalary() - teacher2.getSalary();
    }
}
