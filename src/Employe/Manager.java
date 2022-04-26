package Employe;

public class Manager extends Employee {
    private String name;
    private int age;
    private char gender;
    private int salaryDay;
    private int kolvoEmploe;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getSalaryDay() {
        return salaryDay;
    }

    public int getKolvoEmploe() {
        return kolvoEmploe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSalaryDay(int salaryDay) {
        this.salaryDay = salaryDay;
    }

    public void setKolvoEmploe(int kolvoEmploe) {
        this.kolvoEmploe = kolvoEmploe;
    }

    public Manager( String name, int age, char gender, int salaryDay, int kolvoEmploe) {
        super(name, age, gender, salaryDay);
        this.salaryDay = salaryDay;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.kolvoEmploe = kolvoEmploe;
    }

@Override
    public int getSalary(Month[] monthArray) {
        int  salaryMonth = 0;
       salaryMonth = super.getSalary(monthArray) + (super.getSalary(monthArray)* kolvoEmploe /100 );
        return salaryMonth ;

   }
}

