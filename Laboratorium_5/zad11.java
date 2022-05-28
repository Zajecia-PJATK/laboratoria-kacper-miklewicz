class Main {
    public static void main(String[] args) {
        GradedActivity gradedActivity1 = new GradedActivity();
        gradedActivity1.setScore(67);

        GradedActivity gradedActivity2 = new GradedActivity();
        gradedActivity2.setScore(89);

        System.out.println(gradedActivity2.compareTo(gradedActivity1));
    }
}

class GradedActivity implements Comparable<GradedActivity> {
    private double score;

    @Override
    public int compareTo(GradedActivity gradedActivity) {
        return (int)(this.getScore() - gradedActivity.getScore());
    }

    public void setScore(double s)
    {
        score = s;
    }

    public double getScore()
    {
        return score;
    }

    public char getGrade(){
        char letterGrade;
        if (score >= 90)
            letterGrade = '5';
        else if (score >= 80)
            letterGrade = '4';
        else if (score >= 70)
            letterGrade = '3';
        else if (score >= 60)
            letterGrade = '2';
        else
            letterGrade = '1';
        return letterGrade;
    }
}
