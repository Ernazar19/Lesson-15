package person;

public class Person {
    private final String name;
    private static byte age;


    public void working(){

    }

    public Person(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public static byte getAge() {
        return age;
    }

    public static void setAge(byte age) {
        Person.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                "age='" + age + '\''+
                '}';
    }
}

