public class Homework4 {
    public static void main(String[] args) {
        int mass[] = {-1, -2, -3, -4, -5, 0, 10};
        int max = mass[0];
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
        }
        System.out.println(max);
    }
}
