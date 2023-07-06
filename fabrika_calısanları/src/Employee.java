public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double Tax() {
        double tax = 0.0;
        if (salary > 1000) {
            tax = salary * 0.03;
        }
        return tax;
    }

    public double Bonus() {
        double bonus = 0.0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    public double raiseSalary() {
        double raise = 0.0;
        int workingYear = 2021 - hireYear;
        if (workingYear < 10) {
            raise = salary * 0.05;
        }
        if (workingYear >= 10 && workingYear < 20) {
            raise = salary * 0.1;
        }
        if (workingYear >= 20) {
            raise = salary * 0.15;
        }
        return raise;
    }

    public double totalSalary(){
        double totalSalary = 0.0;
        totalSalary = ((salary + raiseSalary() + Bonus()) - Tax());
        return totalSalary;
    }

    @Override
    public String toString() {
        return
                "\nName : " + name +
                        "\nMaaş : " + salary +
                        "\nÇalışma Saati : " + workHours +
                        "\nBaşlangıç Yılı : " + hireYear +
                        "\nVergi : " + Tax() +
                        "\nBonus : " + Bonus() +
                        "\nMaaş Artışı : " + raiseSalary() +
                        "\nVergi ve Bonuslar ile birlikte maaş : " + ((salary - Tax()) + Bonus())+
                        "\nToplam Maaş : " + totalSalary();
    }
}
