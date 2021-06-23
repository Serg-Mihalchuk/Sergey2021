public class Homework4 {
    public static void main(String[] args) {
        int mass[] = {1, 2, 3, 4, 5, 100, 99};
        int max = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }

        }
        System.out.println(max);
    }
}