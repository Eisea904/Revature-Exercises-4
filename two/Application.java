package two;

public class Application {

    public static void main(String[] args) {
        PrivatePerson bb = new PrivatePerson();
        bb.setAge(10);
        bb.setName("Bobby");

        System.out.println(bb.getName() + " is " + bb.getAge() + " years old!");
    }
}