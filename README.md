Berikut adalah file README.md yang diimplementasikan dengan kode yang baru Anda berikan:

```markdown
# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data kucing menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama, jenis, warna, dan umur kucing, dan memberikan output berupa informasi detail dari kucing tersebut termasuk umur dalam tahun manusia.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kucing`, `DetailKucing`, dan `KucingAksi` adalah contoh dari class.

```java
public class Kucing {
    ...
}

public class DetailKucing extends Kucing {
    ...
}

public class KucingAksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `kucing[i] = new DetailKucing(nama, jenis, warna, umur);` adalah contoh pembuatan object.

```java
kucing[i] = new DetailKucing(nama, jenis, warna, umur);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama`, `jenis`, `warna`, dan `umur` adalah contoh atribut.

```java
private String nama;
private String jenis;
private String warna;
private int umur;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kucing` dan `DetailKucing`.

```java
public Kucing(String nama, String jenis, String warna, int umur) {
    this.nama = nama;
    this.jenis = jenis;
    this.warna = warna;
    this.umur = umur;
}

public DetailKucing(String nama, String jenis, String warna, int umur) {
    super(nama, jenis, warna, umur);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama`, `setJenis`, `setWarna`, dan `setUmur` adalah contoh method mutator.

```java
public void setNama(String nama) {
    this.nama = nama;
}

public void setJenis(String jenis) {
    this.jenis = jenis;
}

public void setWarna(String warna) {
    this.warna = warna;
}

public void setUmur(int umur) {
    this.umur = umur;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getJenis`, `getWarna`, dan `getUmur` adalah contoh method accessor.

```java
public String getNama() {
    return nama;
}

public String getJenis() {
    return jenis;
}

public String getWarna() {
    return warna;
}

public int getUmur() {
    return umur;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama`, `jenis`, `warna`, dan `umur` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```java
private String nama;
private String jenis;
private String warna;
private int umur;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `DetailKucing` mewarisi `Kucing` dengan sintaks `extends`.

```java
public class DetailKucing extends Kucing {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi. Polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `tampilkanInfo(String)` di `Kucing` merupakan overloading method `tampilkanInfo` dan `tampilkanInfo` di `DetailKucing` merupakan override dari method `tampilkanInfo` di `Kucing`.

```java
// Polimorfisme overloading
public String tampilkanInfo(String makananFavorit) {
    return tampilkanInfo() + "\nMakanan Favorit: " + makananFavorit;
}

// Polimorfisme overriding
@Override
public String tampilkanInfo() {
    return super.tampilkanInfo() +
           "\nUmur dalam Tahun Manusia: " + getUmurManusia();
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, seleksi tidak digunakan secara eksplisit, namun logika seleksi dapat diimplikasikan dalam method lain seperti `getUmurManusia`.

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```java
for (int i = 0; i < kucing.length; i++) {
    ...
}

for (DetailKucing data : kucing) {
    System.out.println("============");
    System.out.println("Detail Kucing: ");
    System.out.println(data.tampilkanInfo());
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan nama kucing " + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("Detail Kucing: ");
System.out.println(data.tampilkanInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `DetailKucing[] kucing = new DetailKucing[2];` adalah contoh penggunaan array.

```java
DetailKucing[] kucing = new DetailKucing[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```java
try {
    // code that might throw an exception
} catch (NumberFormatException e) {
    System.out.println("Kesalahan format nomor: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Kesalahan umum: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Wisnu Setia Budi  
NPM: 2210010293
