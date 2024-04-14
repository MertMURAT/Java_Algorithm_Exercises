package soru_9;

public class OfficeEmployee extends Employee {

    public OfficeEmployee(String name, String surname, String title, double salary) {
        super(name, surname, title, salary);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String SetTitle(){
        if(salary >= 8000 && salary <= 12000){
            title = "Çalışan";
        }else if(salary > 12000){
            title = "Kıdemli Çalışan";
        }else{
            title = "Stajyer";
        }
        return title;
    }

    @Override
    public void SalaryUp(double num){
        salary += salary * num;
    }   
        
}
