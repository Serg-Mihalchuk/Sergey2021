public class Homework3 {
    public static void main(String[] args) {
        int mass[] = {0, -2, 3, -1, 6};
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            count += mass[i];
        }
        System.out.println((double) count / mass.length);
    }
}
