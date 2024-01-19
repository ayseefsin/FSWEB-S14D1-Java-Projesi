public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }

    public void work (){
        setSalary(getSalary()+ 10000) ;
        System.out.println("Junior developer starts to working");
    }
}
