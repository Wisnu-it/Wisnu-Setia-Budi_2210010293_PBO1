package pbo;

public class Kucing {
    // atribut enkapsulasi
    private String nama;
    private String jenis;
    private String warna;
    private int umur;

    // konstruktor
    public Kucing(String nama, String jenis, String warna, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
        this.umur = umur;
    }

    // mutator (setter)
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

    // accessor (getter)
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

    // metode untuk menampilkan informasi
    public String tampilkanInfo() {
        return "Nama: " + getNama() +
               "\nJenis: " + getJenis() +
               "\nWarna: " + getWarna() +
               "\nUmur: " + getUmur();
    }

    // polimorfisme overloading
    public String tampilkanInfo(String makananFavorit) {
        return tampilkanInfo() + "\nMakanan Favorit: " + makananFavorit;
    }
}