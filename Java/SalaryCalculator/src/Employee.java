public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary > 1000){
            return salary * 0.03;
        } else {
            return 0;
        }
    }

    int bonus(){
        if (this.workHours > 40){
            return  (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary(){
        int year = 2023;
        if (year - this.hireYear < 10){
            return salary * 0.05;
        } else if (year - this.hireYear < 20 ) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }

    void printInfo(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Haftalık çalışma saaati: " + this.workHours);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş artışı: " + raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " + (salary + tax() + bonus()));
        System.out.println("Toplam maaş: " + (salary + raiseSalary()));
    }

}
