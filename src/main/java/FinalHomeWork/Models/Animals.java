package FinalHomeWork.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public abstract class Animals {
    String title;
    List<String> commands;

    String name;

    long date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Scanner animalName = new Scanner(System.in);
        this.name = String.valueOf(animalName);
    }

    public long getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date.getTime();
    }

    public Animals(String title, String name, long date) {
        this.title = title;
        this.commands = new ArrayList<>();
        this.name = name;
        this.date = date;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getCommands() {
        return commands;
    }

    public void setCommands(List<String> commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "title='" + title + '\'' +
                ", commands=" + commands +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
