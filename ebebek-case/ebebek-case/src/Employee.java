public class Employee {
    private String nameSurname;
    private double salary;
    private double workHours;
    private int hireYear;

    public Employee(String nameSurname, double salary, double workHours, int hireYear) {
        this.nameSurname = nameSurname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    //Calculation of tax
    public double tax(double salary){
        this.salary = salary;
        double tax = 0.0;
        if (salary>=0){
            if (salary<1000 && salary>=0){
                //System.out.println(salary);
                return tax;
            } else {
                //System.out.println(salary*1.03);
                tax = salary*0.03;
                return tax;
            }
        }else
            return tax;
    }
    //Calculation of bonus
    public double bonus(double workHours){
        this.workHours = workHours;
        double bonus = 0.0;
        double shift = 40;
        if (workHours>40){
            shift = workHours-shift;
            bonus = shift*30;
            return bonus;
        }else
            return bonus;
    }
    //Calculation of raised salary
    public double raiseSalary(int hireYear){
        this.hireYear = hireYear;
        int workYear;
        double raise = 0.0;
        if (hireYear<=2021){
            workYear = 2021 - hireYear;
            if (workYear<10){
                raise = salary*0.05;
                return raise;
            }
            else if (workYear>9 && workYear<20){
                raise = salary*0.10;
                return raise;
            }
            else{
                raise = salary*0.15;
                return raise;
            }
        } else
            return raise;
    }
    //Print screen
    public void toStrings(){
        System.out.println("Adı : "+this.getNameSurname());
        System.out.println("Maaşı : "+this.getSalary());
        System.out.println("Çalışma Saati : "+this.getWorkHours());
        System.out.println("Başlangıç Yılı : "+this.getHireYear());
        System.out.println("Vergi : "+tax(getSalary()));
        System.out.println("Bonus : "+bonus(getWorkHours()));
        System.out.println("Maaş Artışı : "+raiseSalary(getHireYear()));
        System.out.println("Vergi ve bonuslar ile maaş :"+(this.getSalary()+tax(getSalary())+bonus(getWorkHours())));
        System.out.println("Toplam Maaş : "+(this.getSalary()+tax(getSalary())+bonus(getWorkHours())+raiseSalary(getHireYear())));
        System.out.println("-----------------------------------");
    }

    //Getters and Setters methods
    public String getNameSurname() {
        return nameSurname;
    }
    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getWorkHours() {
        return workHours;
    }
    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }
    public int getHireYear() {
        return hireYear;
    }
    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }
}
