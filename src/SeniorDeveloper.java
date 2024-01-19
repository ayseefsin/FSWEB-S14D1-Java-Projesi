public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }
    public void work(){
        setSalary(getSalary()+ 25000) ;
        System.out.println("Senior developer starts to work");
    }
}
