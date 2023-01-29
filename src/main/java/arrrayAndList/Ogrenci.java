package arrrayAndList;

import java.util.Date;

public class Ogrenci {
    String name;
    String lastName;
    int age;
    Date date;
    boolean isParentsLive;

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", date=" + date +
                ", isPerentsLive=" + isParentsLive +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isParentsLive() {
        return isParentsLive;
    }

    public void setParentsLive(boolean parentsLive) {
        isParentsLive = parentsLive;
    }

    public Ogrenci(String name, String lastName, int age, Date date, boolean isParentsLive) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.date = date;
        this.isParentsLive = isParentsLive;
    }

    public Ogrenci() {
    }
}
