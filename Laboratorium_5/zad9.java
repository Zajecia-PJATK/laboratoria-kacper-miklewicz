import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        GradedActivity grade1 = new GradedActivity();
        grade1.setScore(67);
        GradedActivity grade2 = new GradedActivity();
        grade2.setScore(95);
        GradedActivity grade3 = new GradedActivity();
        grade3.setScore(85);
        GradedActivity grade4 = new GradedActivity();
        grade4.setScore(78);
        GradedActivity grade5 = new GradedActivity();
        grade5.setScore(34);

        ArrayList<GradedActivity> grades = new ArrayList<>(Arrays.asList(grade1, grade2, grade3, grade4, grade5));

        CourseGrades courseGrades = new CourseGrades(grades);

        System.out.println("Najnizsza ocena: " + courseGrades.getLowest().getGrade());
        System.out.println("Najwyzsza ocena: " + courseGrades.getHighest().getGrade());
        System.out.println("Srednia: " + courseGrades.getAverage());
    }
}

interface Analyzable{
    double getAverage();
    GradedActivity getHighest();
    GradedActivity getLowest();
}

class CourseGrades implements Analyzable {
    ArrayList<GradedActivity> grades = new ArrayList<>();

    public CourseGrades(ArrayList<GradedActivity> grades) {
        this.grades = grades;
    }

    @Override
    public double getAverage() {
        double sum = 0;
        for (GradedActivity grade : grades) {
            switch (grade.getGrade()) {
                case '5':
                    sum += 5;
                    break;
                case '4':
                    sum += 4;
                    break;
                case '3':
                    sum += 3;
                    break;
                case '2':
                    sum += 2;
                    break;
                case '1':
                    sum += 1;
                    break;
            }
        }
        return sum / grades.size();
    }

    @Override
    public GradedActivity getHighest() {
        int maxIndex = 0;
        double max = grades.get(0).getGrade();
        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i).getGrade() > max) {
                maxIndex = i;
                max = grades.get(i).getGrade();
            }
        }
        return grades.get(maxIndex);
    }

    @Override
    public GradedActivity getLowest() {
        int lowestIndex = 0;
        double lowest = grades.get(0).getGrade();
        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i).getGrade() < lowest) {
                lowest = grades.get(i).getGrade();
                lowestIndex = i;
            };
        }
        return grades.get(lowestIndex);
    }

    public ArrayList<GradedActivity> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<GradedActivity> grades) {
        this.grades = grades;
    }
}

