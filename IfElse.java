package pemrogramandasar01;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bil = input.nextInt();
        System.out.println("");

        if (bil % 5 == 0 && bil % 2 != 0) {
            System.out.println("Program Started");
        } else {
            System.out.println("Program Halted");
        }
        System.out.println("Artinya Bilangan kelipatan lima");
    }

}
