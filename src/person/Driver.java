package person;

public class Driver extends  Person{


    public Driver(String name, byte age) {
        super(name, age);
    } @Override
    public void working(){
        System.out.println("Truck Driver");
    }

    @Override
    public String toString() {
        return "Driver{"+
                "name='" + getName() + '\'' +
                "age='" + getAge() + '\''+
                '}';
    }
}
