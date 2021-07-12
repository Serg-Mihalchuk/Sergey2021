package Test;

public class Main {
    public static void main(String[] args) {
        People person1 = new People();
        person1.name = "Serg";
        person1.age = 37;
        person1.hight = 181.5;
        People person2 = new People();
        person2.name = "Natali";
        person2.age = 33;
        person2.hight = 168;
        People person3 = new People();
        person3.name = "Euhenia";
        person3.age = 12;
        person3.hight = 164;
        People person4 = new People();
        person4.name = "Arina";
        person4.age = 5;
        person4.hight = 111;
        System.out.println("Middle age " + (double) (person1.age + person2.age + person3.age + person4.age) / 4);
        System.out.println(person1.info());

    }
}
