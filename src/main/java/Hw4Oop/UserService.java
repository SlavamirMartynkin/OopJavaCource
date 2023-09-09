package Hw4Oop;

import java.util.List;

public interface UserService<T> {
    List<T> getAll();

    void create(String name, int score, int age);

    void create(String name, String objectToTeach, int salary);


}
