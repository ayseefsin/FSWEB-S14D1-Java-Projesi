public class HRManager extends Employee {
    public String[] JuniorDevelopers= new String[5];
    private String[] MidDevelopers= new String[3];
    private String[] SeniorDevelopers = new String[2];
    public HRManager(long id, String name, int salary) {
        super(id, name, salary);
    }

    public String[] getJuniorDevelopers() {
        return JuniorDevelopers;
    }

    public void setJuniorDevelopers(String[] juniorDevelopers) {
        JuniorDevelopers = juniorDevelopers;
    }

    public String[] getMidDevelopers() {
        return MidDevelopers;
    }

    public void setMidDevelopers(String[] midDevelopers) {
        MidDevelopers = midDevelopers;
    }

    public String[] getSeniorDevelopers() {
        return SeniorDevelopers;
    }

    public void setSeniorDevelopers(String[] seniorDevelopers) {
        SeniorDevelopers = seniorDevelopers;
    }

    public HRManager(long id, String name, int salary, String[] juniorDevelopers,
                     String[] midDevelopers, String[] seniorDevelopers)
    {
        super(id, name, salary);
        JuniorDevelopers = juniorDevelopers;
        MidDevelopers = midDevelopers;
        SeniorDevelopers = seniorDevelopers;
    }
    public void addEmployee(int index, JuniorDeveloper juniorDeveloper){
        try{
            if(JuniorDevelopers[index]==null){
                JuniorDevelopers[index]= juniorDeveloper.getName();
            }else{
                System.out.println("This index cannot be used, please change the index and retry! ");
            }
        }catch(ArrayIndexOutOfBoundsException exception) {

            System.out.println("index not found!" + index);
        }
    }
    public void addEmployee(int index, MidDeveloper midDeveloper){
        try{
            if(MidDevelopers[index]==null){
                MidDevelopers[index]= midDeveloper.getName();
            }else{
                System.out.println("This index cannot be used, please change the index and retry! ");
            }
        }catch(ArrayIndexOutOfBoundsException exception) {

            System.out.println("index not found!" + index);
        }
    }
    public void addEmployee(int index, SeniorDeveloper seniorDeveloper){
        try{
            if(SeniorDevelopers[index]==null){
                SeniorDevelopers[index]= seniorDeveloper.getName();
            }else{
                System.out.println("This index cannot be used, please change the index and retry! ");
            }
        }catch(ArrayIndexOutOfBoundsException exception) {

            System.out.println("index not found!" + index);
        }
    }




    public void work (){
        setSalary(getSalary()+ 20000) ;
        System.out.println("HR Manager starts to working");
    }

    @java.lang.Override
    public String toString() {
        return "HRManager{" +
                "JuniorDevelopers=" + java.util.Arrays.toString(JuniorDevelopers) +
                ", MidDevelopers=" + java.util.Arrays.toString(MidDevelopers) +
                ", SeniorDevelopers=" + java.util.Arrays.toString(SeniorDevelopers) +
                '}';
    }
}
