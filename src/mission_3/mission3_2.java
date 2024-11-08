package mission_3;

public class mission3_2 {
    public static void main(String[] args) {
        Employee employee = new Employee("aaa",1000);
        Employeer employeer = new Employeer("bbb",2000,"매니저");
        System.out.println(employee.getInfo());
        System.out.println(employeer.getInfo());
    }
}

class Employee{
    private String name;
    private int money;

    public Employee(String name, int money){
        this.name = name;
        this.money = money;
    }
    public String getInfo(){
        return "직원이름:" + this.name + "급여:" + this.money;
    }
}

class Employeer extends Employee{
    private String manager;

    public Employeer(String name, int money, String manager) {
        super(name, money);
        this.manager = manager;
    }
    @Override
    public String getInfo(){
        return super.getInfo() + "직책:" + this.manager;
    }
}



