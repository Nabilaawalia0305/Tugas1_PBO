#include <iostream>
using namespace std;

int main() {
    // Variabel
    int angka = 10; // Tipe data integer
    float pecahan = 3.14; // Tipe data float
    char huruf = 'A'; // Tipe data karakter
    bool benar = true; // Tipe data boolean

    // Array satu dimensi
    int arrSatuDimensi[5] = {1, 2, 3, 4, 5};

    // Array multidimensi
    int arrMultiDimensi[2][3] = {{1, 2, 3}, {4, 5, 6}};

    // For loop
    for(int i = 0; i < 5; i++) {
        cout << "Elemen ke-" << i << " dari array: " << arrSatuDimensi[i] << endl;
    }

    // If statement
    if(angka > 5) {
        cout << "Angka lebih besar dari 5." << endl;
    } else {
        cout << "Angka kurang dari atau sama dengan 5." << endl;
    }

    // While loop
    int j = 0;
    while(j < 5) {
        cout << "Iterasi ke-" << j << " dari while loop." << endl;
        j++;
    }

    // Do-While loop
    int k = 0;
    do {
        cout << "Iterasi ke-" << k << " dari do-while loop." << endl;
        k++;
    } while(k < 5);

    // Input
    int input;
    cout << "Masukkan sebuah angka: ";
    cin >> input;

    // Output
    cout << "Anda memasukkan angka: " << input << endl;

    // Comment
    // Ini adalah contoh program C++ yang mencakup elemen yang diminta.

    return 0;
}

