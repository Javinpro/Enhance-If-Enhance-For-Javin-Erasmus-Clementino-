public class BasicFor {
    public static void main(String[] args) {
        // Baris ini mendefinisikan basic for loop. Dimulai dengan inisialisasi variabel i dengan nilai awal 0. Iterasi akan terus dilakukan selama nilai i kurang dari 5. Setiap kali iterasi dilakukan, nilai i akan bertambah satu.
        for (int i = 0; i < 5; i++) {
            // Baris ini mencetak nilai variabel i ke konsol. Pada setiap iterasi, nilai i akan dicetak bersama dengan teks "Nilai i: ".
            System.out.println("Nilai i: " + i);
        }
    }
} //Alasannya tidak termasuk kedalam enhanced for loop adalah karena enhanced for loop digunakan untuk meng loop elemen - elemen dalam array, sementara basic for loop untuk meng loop sejumlah iterasi tertentu dengan mengelola nilai awal, kondisi, serta perubahan variabel secara langsung. Sehingga enhanced for loop tidak cocok untuk digunakan dalam kasus ini, karena enhanced for loop tidak menyediakan cara langsung untuk mengelola nilai awal dan perubahan variabel iterasi.

