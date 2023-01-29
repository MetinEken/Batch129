package mentor.okulProgrami;

import java.util.Date;

public class Ogrenci {

    String name;
    String lastName;
    int age;
    Date dateBorn;
    boolean isParentsLive;

    public Ogrenci() {
    }

    public Ogrenci(String name, String lastName, int age, Date dateBorn, boolean isParentsLive) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dateBorn = dateBorn;
        this.isParentsLive = isParentsLive;
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

    public Date getDateBorn() {
        return dateBorn;
    }

    public void setDateBorn(Date dateBorn) {
        this.dateBorn = dateBorn;
    }

    public boolean isParentsLive() {
        return isParentsLive;
    }

    public void setParentsLive(boolean parentsLive) {
        isParentsLive = parentsLive;
    }

    @Override
    public String toString() {
        return "Student{" +
                "isim='" + name + '\'' +
                ", soyisim='" + lastName + '\'' +
                ", age=" + age +
                ", kayit TArihi=" + dateBorn +
                ", isParentsLive=" + isParentsLive +
                '}';
    }
}
