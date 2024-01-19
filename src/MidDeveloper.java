public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name, int salary) {
        super(id, name, salary);

    }
    public void work (){
        setSalary(getSalary()+ 10000) ;
        System.out.println("Mid developer starts to working");
    }
}
