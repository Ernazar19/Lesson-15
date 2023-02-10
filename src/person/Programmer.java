package person;

public class Programmer extends Person{


    public Programmer(String name, byte age) {
        super(name, age);
    } @Override
    public void working(){
        System.out.println("Java Programmer");
    }

    @Override
    public String toString() {
        return "Programmer{"+
                "name='" + getName() + '\'' +
                "age='" + getAge() + '\''+
                '}';
    }
}
