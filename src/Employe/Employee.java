package Employe;

public class Employee {
    private String name;
    private int age;
    private char gender;
    private int salaryDay;

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
    public Employee (String name, int age, char gender, int salaryDay){
        this.salaryDay = salaryDay;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

     public int[] getSalary(Month[] monthArray){
        int [] salaryMonth = new int [monthArray.length];
        for(int i = 0; i < monthArray.length; i++){
           salaryMonth[i] = monthArray[i].getKolvoRabDays() * getSalaryDay();
        }return salaryMonth;
     }

}
