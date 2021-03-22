package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private Double salary;

    public Employee(String name, String niNumber, Double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void raiseSalary(Double salaryIncrease){
        setSalary(this.salary + salaryIncrease);
    }

    public double payBonus(){
        return this.salary * 0.01;
    }

}
