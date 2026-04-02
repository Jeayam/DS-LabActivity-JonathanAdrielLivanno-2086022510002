# Linked List - Penjelasan Singkat

## 1. Fungsi Head
LinkedList membutuhkan variabel `head` sebagai titik awal (entry point). Tanpa `head`, program tidak dapat mengetahui awal dari struktur data.

## 2. Reference pada Node
Setiap node menyimpan reference (alamat) ke node berikutnya. Hal ini memungkinkan node-node saling terhubung dalam satu rangkaian.

## 3. Perbandingan Insert (LinkedList vs Array)
Penambahan node di awal LinkedList lebih efisien karena hanya perlu mengubah reference (`O(1)`).  
Sedangkan pada array, perlu menggeser seluruh elemen terlebih dahulu (`O(n)`).

## 4. Insert di Depan (Proses)
Langkah-langkah:
- `newNode.next = head` → node baru menunjuk ke head lama
- `head = newNode` → node baru menjadi head

## 5. Perbedaan Kondisi While
- `while (current.next != null)` → berhenti di node terakhir
- `while (current != null)` → berjalan sampai seluruh node selesai

## 6. Pencarian Data
Array lebih cepat dalam pencarian karena menggunakan index langsung.  
LinkedList lebih lambat karena harus menelusuri dari awal (sequential search).

## 7. Efisiensi Penambahan Data
LinkedList lebih efisien untuk penambahan data (terutama di depan) karena hanya mengubah reference (`O(1)`).

## 8. Penggunaan Memori
LinkedList menggunakan lebih banyak memori karena setiap node menyimpan:
- data
- reference ke node berikutnya