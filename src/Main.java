public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        System.out.println("*******************************************");

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());
        System.out.println("***************************************");

        Employee e1 = new Employee(1,"aysin", 50000);
        HRManager h1 = new HRManager(12,"okşan",100000);
        //h1.getJuniorDevelopers() = new String[4];
        JuniorDeveloper j1 = new JuniorDeveloper(1,"zeus",50000);
        JuniorDeveloper j2 = new JuniorDeveloper(1, "hades", 60000);
        JuniorDeveloper j3 = new JuniorDeveloper(2,"nemesis", 55000);
        JuniorDeveloper j4 = new JuniorDeveloper(20,"ceren", 52000);
        MidDeveloper m1= new MidDeveloper(2,"ahmet",80000);
        SeniorDeveloper s1 =new SeniorDeveloper(3,"vildan",100000);
        System.out.println("worker "+ e1.getName()+" gets " + e1.getSalary() + " salary." );
        h1.addEmployee(0,j1);
        System.out.println("juniors: " + java.util.Arrays.toString(h1.getJuniorDevelopers()));
        h1.addEmployee(1,j2);
        h1.addEmployee(2,j3);
        System.out.println("juniors: " + java.util.Arrays.toString(h1.getJuniorDevelopers()));
        h1.addEmployee(1,j4);
        h1.addEmployee(6,j3);

    }
}