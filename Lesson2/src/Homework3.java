public class Homework3 {
    public static void main(String[] args) {
        int mass[] = {2, 3, 4, 5, 6};
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            count += mass[i];
        }
        System.out.println(count / mass.length);
    }
}
