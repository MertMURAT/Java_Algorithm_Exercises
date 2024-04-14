package soru_9;

public class Employee {
    protected String name;
    protected String surname;
    protected String title;
    protected double salary;

    public Employee(String name, String surname, String title, Double salary) {
        this.name = name;
        this.surname = surname;
        this.title = title;
        this.salary = salary;
    } 

    public String SetTitle(){
        return "";
    }

    public void SalaryUp(double num){
        salary += salary * num;
    }
    
}
