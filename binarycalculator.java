import java.util.Scanner;

public class binarycalculator {


    static void decToBinary(int number) {
        int i = 0;
        int[] binaryNum = new int[1000];
        while (number > 0) {
            binaryNum[i] = number % 2;
            number = number / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.println(binaryNum[j]);
        }

    }
    public static void main(String[] args) {
        int number = 144;
        System.out.println("--------------------------------");
        decToBinary(number);
        System.out.println("--------------------------------");
    }
}