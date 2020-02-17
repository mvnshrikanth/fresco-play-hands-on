package javaApp;

public class EvenSum {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int even[] = new int[num];
        int sum = 0;
        String evennums = "";

        int rem = num;

        for (int i = 0; num > 0; num--, i++) {
            rem = num % 2;
            if (rem == 0) {
                even[i] = num;
                evennums = num + "," + evennums;
                sum = sum + num;
            }
        }

        System.out.println(evennums);
        System.out.println(sum);
    }
}  