package p5.multiple.inheritance;

class Employee implements Sortable {
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;
    
    public Employee(String n, double s, int day, int month, int year){
        this.name = n;
        this.salary = s;
        this.hireday = day;
        this.hiremonth = month;
        this.hireyear = year;
    }
    public void raiseSalary(double byPercent){
        salary *= 1 + byPercent/100;
    }
    public void print(){
        System.out.println(this.name + " " + this.salary + "-" + this.hiremonth + "-" + this.hireyear);
    }
    
    @Override
    public int compare(Sortable b){
        Employee eb = (Employee) b;
        if (salary<eb.salary) return -1;
        if (salary>eb.salary) return +1;
        return 0;
    }
    public int getHireyear(){
        return hireyear;
    }
}
