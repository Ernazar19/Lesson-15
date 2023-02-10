import person.Builder;
import person.Driver;
import person.Programmer;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Ulan", (byte) 27);
        System.out.println(programmer);
        programmer.working();
        Driver driver = new Driver("Duishon",(byte) 38);
        System.out.println(driver);
        driver.working();
        Builder builder = new Builder("Oljobai",(byte) 47);
        System.out.println(builder);
        builder.working();

    }
}