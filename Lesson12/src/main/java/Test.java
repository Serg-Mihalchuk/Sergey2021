import lombok.Getter;
import lombok.Setter;

public class Test {
    public static void main(String[] args) {
        int x = 7;
        incrementNumber(x);
        System.out.println("X = " + x);

        Cat cat = new Cat(7);
        catLevelUp(cat);
        System.out.println("Cat age = " + cat.getAge());

    }

    public static void catLevelUp(Cat cat) {

        cat.setAge(cat.getAge() + 1);
    }

    public static void incrementNumber(int x) {
        x++;
    }

    @Setter
    @Getter
    static
    class Cat {
        int age;

        public Cat(int age) {
            this.age = age;
        }
    }


}
