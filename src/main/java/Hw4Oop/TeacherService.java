package Hw4Oop;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int score, int age) {
    }

    @Override
    public void create(String name, String objectToTeach, int salary) {
        Teacher teacher = new Teacher(name, objectToTeach,salary);
        teachers.add(teacher);
    }
    protected void correct(String name, String newName, String newObjectToTeach, int newSalary){
        for (int teacher = 0; teacher < teachers.size(); teacher++) {
            if (teachers.get(teacher).getName().equals(name)){
                teachers.remove(teachers.get(teacher));
            }
        }
        create(newName, newObjectToTeach, newSalary);
    }
}