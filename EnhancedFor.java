public class EnhancedFor {
    public static void main(String[] args) {
        // Membuat array dua dimensi 'matriks' yang berisi beberapa array satu dimensi yang masing - masing mempresentasikan baris dalam matriks
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        for (int[] row : matrix) {         // Memulai enhanced for loop untuk mengiterasi melalui setiap array satu dimensi (baris) dalam array dua dimensi 'matriks'. Dan di variabel 'row' akan menyimpan setiap array satu dimensi dalam setiap iterasi
            for (int element : row) { //Mencetak nilai dari setiap elemen dalam array satu dimensi (baris). Dalam contoh ini, nilai setiap elemen dicetak dengan spasi di antara elemen-elemen pada baris yang sama.
                System.out.print(element + " "); //Mengakhiri enhanced for loop dalam loop luar dan mencetak baris kosong baru setelah setiap baris matriks selesai dicetak. Ini memberikan format yang lebih baik untuk output.
            }
            System.out.println();
        }
    }
}
