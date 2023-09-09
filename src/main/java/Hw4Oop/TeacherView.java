package Hw4Oop;

import java.util.List;

public class TeacherView<T extends Teacher> implements UserView<T> {

    public void sendOnConsole(List<T> teachers) {
        for(T user: teachers){
            System.out.println(user);
        }
    }
}
