package pbo;

// pewarisan
public class DetailKucing extends Kucing {
    // konstruktor
    public DetailKucing(String nama, String jenis, String warna, int umur) {
        super(nama, jenis, warna, umur);
    }

    // metode untuk menampilkan umur dalam tahun manusia
    public int getUmurManusia() {
        return getUmur() * 7;
    }

    // menambahkan metode dengan seleksi
    public String kategoriUmur() {
        if (getUmur() <= 1) {
            return "Kucing Muda";
        } else if (getUmur() <= 7) {
            return "Kucing Dewasa";
        } else {
            return "Kucing Tua";
        }
    }

    // polimorfisme overriding
    @Override
    public String tampilkanInfo() {
        return super.tampilkanInfo() +
               "\nUmur dalam Tahun Manusia: " + getUmurManusia() +
               "\nKategori Umur: " + kategoriUmur();
    }
}