import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello SkyPro!");
        // Задание номер 1
        System.out.println("Задание номер 1 часть 1");
        int[] agg = new int[12];
        agg[0] = 0;
        for (int i = 0; i < agg.length; i++) {
            System.out.println(agg[0]);

        }
        System.out.println("Задание 1 часть 2");


        int[] weight = new int[3];
        for (int i = 0; i < weight.length; i++) {
            weight[i] = i + 1;
            if (i != 0) {
            }
            System.out.print(weight[i]);

            System.out.println();


        }
        System.out.println("Задание номер 1 часть 3");
        double[] free = {1.75, 2.57, 6.987};
        for (int i = 0; i < free.length; i++) {
            System.out.println(free[0]);
            System.out.println(free[1]);
            System.out.println(free[2]);
            break;

        }
        // Задание номер 2
        System.out.println("Задание номер 2 ");
        int[] agg1 = new int[12];
        for (int i = 0; i < agg1.length; i++) {
            agg1[i] = i + 1;
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(agg1[i]);
        }
        System.out.println();
        int[] weight1 = new int[3];
        for (int i = 0; i < weight1.length; i++) {
            weight1[i] = i + 1;
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(weight1[i]);
        }
        System.out.println();
        double[] free1 = {1.75, 2.57, 6.987};
        for (int i = 0; i < free1.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(free1[i]);
        }
        System.out.println();

        //Задание номер 3
        System.out.println("Задание номер 3");
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] free2 = {1.75, 2.57, 6.987};
        for (int j = free2.length - 1; j >= 0; j--) {
            System.out.print(free2[j]);
            if (j != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //Задача номер 4
        System.out.println("Задание номер 4 ");
        int[] bananas = {1, 3, 5, 7, 9};
        for (int j = 0; j < bananas.length; j++) {
            if (bananas[j] % 2 != 0) {
                bananas[j] = bananas[j] + 1;
            }
            System.out.print(bananas[j] + " ");
        }


    }


}



