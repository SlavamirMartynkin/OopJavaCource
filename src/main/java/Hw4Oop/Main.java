package Hw4Oop;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Bob", "Math", 8000);
        Teacher teacher2 = new Teacher("Bill", "Biology", 7000);
        Teacher teacher3 = new Teacher("Martin", "English", 5000);
        Teacher teacher4 = new Teacher("John", "Literature", 4000);

        List<Teacher> TeacherList = new ArrayList<>();
        TeacherList.add(teacher1);
        TeacherList.add(teacher2);
        TeacherList.add(teacher3);
        TeacherList.add(teacher4);

        System.out.println(TeacherList);
        TeacherList.sort(new TeacherComporator<Teacher>());
        System.out.println(TeacherList);
        System.out.println("-----------------------------------------------------");


        TeacherService teacherService = new TeacherService();
        teacherService.create("Ivan", "Math", 7500);
        teacherService.create("Vlad", "Biology", 9000);
        teacherService.create("Egor", "Literature", 5000);

        teacherService.getAll().sort(new TeacherComporator<Teacher>());
        System.out.println(teacherService.getAll());

        teacherService.correct("Ivan", "Den", "Chemistry", 8000);
        System.out.println(teacherService.getAll());
        System.out.println("-----------------------------------------------------");

        TeacherView tv = new TeacherView();
        tv.sendOnConsole(TeacherList);
        System.out.println("-----------------------------------------------------");
        tv.sendOnConsole(teacherService.getAll());
    }
}