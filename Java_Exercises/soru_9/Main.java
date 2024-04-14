package soru_9;

public class Main {
    public static void main(String[] args) {
        Engineer engineer = new Engineer("Ayşe", "Yılmaz", "Mühendis", 2000);
        engineer.SalaryUp(2);
        engineer.SetTitle();

        System.out.println(engineer.name);
        System.out.println(engineer.surname);
        System.out.println(engineer.title);
        System.out.println(engineer.salary);

        OfficeEmployee officeEmployee = new OfficeEmployee("Ali", "Yılmaz", "Çalışan", 3000);
        officeEmployee.SalaryUp(4);
        officeEmployee.SetTitle();
        
        System.out.println(officeEmployee.name);
        System.out.println(officeEmployee.surname);
        System.out.println(officeEmployee.title);
        System.out.println(officeEmployee.salary);
    }
}
