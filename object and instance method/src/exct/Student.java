package exct;

public class Student {
    private String name;
    private String major;
    private double gpa;

    public Student(String name, String major,double gpa){
        this.setName(name);
        this.setMajor(major);
        this.setGpa(gpa);
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setMajor(String major){
        this.major=major;
    }

    public String getMajor() {
        return major;
    }

    public void setGpa(double gpa){
        this.gpa=gpa;
    }
    public double getGpa(){
        return gpa;
    }


    public boolean onHonourRoll(){
        if(gpa>=3.5){
            return true;
        }
        return false;
    }
}
