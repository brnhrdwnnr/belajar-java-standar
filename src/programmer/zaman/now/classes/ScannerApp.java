package programmer.zaman.now.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nama : ");
        String nama = scanner.nextLine();


        System.out.println("Umur : ");
        Integer umur = scanner.nextInt();


//        scanner.nextBoolean();
//        scanner.nextLong();

        System.out.println("Hello " + nama + " umur anda adalah " + umur);

    }
}
