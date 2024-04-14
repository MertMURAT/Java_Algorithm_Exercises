package soru_9;

public class Engineer extends Employee{

    public Engineer(String name, String surname, String title, double salary) {
        super(name, surname, title, salary);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String SetTitle(){
        if(salary >= 10000 && salary <= 12000){
            title = "Mühendis";
        }else if(salary > 12000 && salary <= 17000){
            title = "Kıdemli Mühendis";
        }else if(salary > 17000){
            title = "Uzman Mühendis";
        }else{
            title = "Stajyer Mühendis";
        }
        return title;
    }

    @Override
    public void SalaryUp(double num){
        salary += (salary * num) + 250;
    }   
    
}
