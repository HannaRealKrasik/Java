package Employe;

public class Manager {
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
       // super(name, age, gender, salaryDay);
        this.salaryDay = salaryDay;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.kolvoEmploe = kolvoEmploe;
    }


    public int[] getSalary(Month[] monthArray) {
        int [] salaryMonth = new int [monthArray.length];
        for(int i = 0; i < monthArray.length; i++) {
            salaryMonth[i] = monthArray[i].getKolvoRabDays() * getSalaryDay();
        }
       int [] salaryMonthMan = new int [monthArray.length];
        for(int i = 0; i <monthArray.length; i++)
         salaryMonthMan[i] = (monthArray[i].getKolvoRabDays() * kolvoEmploe /100 * getSalaryDay()) + monthArray[i].getKolvoRabDays()*getSalaryDay() ;
        return salaryMonth ;

   }
}

