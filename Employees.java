public class Employees {

    String name ;
    int   salary ;
    int workHours;
    int hireYear ;

    Employees(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax (){
        if(this.salary > 1000){
            return this.salary *0.03;
        }else{
            return 0;
        }
    }

    int bonus (){
        if (this.workHours > 40){
            int totalBonus = (this.workHours - 40) * 30;
            return totalBonus;
        }else {
            return 0;
        }
    }

    double raiseSalary(){
        int year = 2021;
        double yearsRaise = 0.0;
        if(year - this.hireYear < 10){
            yearsRaise = this.salary * 0.05;
            return yearsRaise;
        }else if ((year - this.hireYear)>9 &&(year - this.hireYear) <20 ){
            yearsRaise = this.salary * 0.10;
            return yearsRaise;
        }else{
            yearsRaise = this.salary * 0.05;
            return yearsRaise;
        }
    }
    void printEmployessInfo(){
        System.out.println("Adi : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Calisma Saati : " + this.workHours);
        System.out.println(this.hireYear + " senesinde ise basladi. ");
        System.out.println("Vergi Miktari: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maas Zammi : " + raiseSalary());
        System.out.println("Bonus ve Vergi ile Maas Miktari: " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maas: " + (this.salary + bonus() + raiseSalary()));
        System.out.println("==============================================");
    }
}
