public class TernaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        
        // Baris ini menggunakan ternary operator untuk menetapkan nilai variabel max. Ternary operator (x > y) ? x : y mengevaluasi kondisi x > y. Jika kondisi tersebut terpenuhi (true), maka nilai variabel x akan ditetapkan ke variabel max. Jika kondisi tidak terpenuhi (false), maka nilai variabel y akan ditetapkan ke variabel max.
        int max = (x > y) ? x : y;
        
        // Cetak nilai max
        System.out.println("Nilai maksimum: " + max);

        //Dengan menggunakan ternary operator dalam baris ketiga, kita dapat dengan mudah menetapkan nilai maksimum antara dua variabel x dan y dalam satu baris kode. Ini membuat kode menjadi lebih ringkas dan mudah dibaca, serta meningkatkan efisiensi dalam menulis kode.
    }
}
