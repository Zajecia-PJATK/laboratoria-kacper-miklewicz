import java.io.*;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", "12345", 90, 5);
        Student student2 = new Student("Andreas", "Wolff", "56789", 40, 4);
        Student student3 = new Student("Bruce", "Wayne", "32314", -23, 3);
        Student student4 = new Student("Fryderyk", "Chopin", "54546", 123, 3);
        Student student5 = new Student("99999", 65, 4);

        printStudent(student1);
        printStudent(student2);
        printStudent(student3);
        printStudent(student4);
        printStudent(student5);
    }

    public static void printStudent(Student student) {
        System.out.println(student.getName() + " "
                + student.getSurname() + ", "
                + student.getIndex() + ", "
                + student.getPresence() + "%, "
                + student.getPOJGrade());
    }
}

class Student {
    private String name;
    private String surname;
    private String index;
    private double presence;
    private int POJGrade;

    public Student(String name, String surname, String index, double presence, int POJGrade) {
        setName(name);
        setSurname(surname);
        setIndex(index);
        setPresence(presence);
        setPOJGrade(POJGrade);
    }

    public Student(String index, double presence, int POJGrade) {
        this("Unknown", "Unknown", index, presence, POJGrade);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setPresence(double presence) {
        if (presence < 0) {
            this.presence = 0;
        } else if (presence > 100) {
            this.presence = 100;
        } else
            this.presence = presence;
    }


    public void setPOJGrade(int POJGrade) {
        if (this.getPresence() < 50)
            this.POJGrade = 2;
        else
            this.POJGrade = POJGrade;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getIndex() {
        return index;
    }

    public double getPresence() {
        return presence;
    }

    public int getPOJGrade() {
        return POJGrade;
    }
}
