package person;

public class Builder extends Person{


    public Builder(String name, byte age) {
        super(name, age);


    } @Override
    public void working(){
        System.out.println("Foreman");
    }

    @Override
    public String toString() {
        return "Builder{"+
                "name='" + getName() + '\'' +
                "age='" + getAge() + '\''+
                '}';
    }
}
