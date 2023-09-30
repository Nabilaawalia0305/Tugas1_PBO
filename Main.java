import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variabel
        int angka = 10; // Tipe data integer
        float pecahan = 3.14f; // Tipe data float
        char huruf = 'A'; // Tipe data karakter
        boolean benar = true; // Tipe data boolean

        // Array satu dimensi
        int[] arrSatuDimensi = {1, 2, 3, 4, 5};

        // Array multidimensi
        int[][] arrMultiDimensi = {{1, 2, 3}, {4, 5, 6}};

        // For loop
        for(int i = 0; i < 5; i++) {
            System.out.println("Elemen ke-" + i + " dari array: " + arrSatuDimensi[i]);
        }

        // If statement
        if(angka > 5) {
            System.out.println("Angka lebih besar dari 5.");
        } else {
            System.out.println("Angka kurang dari atau sama dengan 5.");
        }

        // While loop
        int j = 0;
        while(j < 5) {
            System.out.println("Iterasi ke-" + j + " dari while loop.");
            j++;
        }

        // Do-While loop
        int k = 0;
        do {
            System.out.println("Iterasi ke-" + k + " dari do-while loop.");
            k++;
        } while(k < 5);

        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int input = scanner.nextInt();

        // Output
        System.out.println("Anda memasukkan angka: " + input);

        // Comment
        // Ini adalah contoh program Java yang mencakup elemen yang diminta.
    }
}
