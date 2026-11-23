
public abstract class Buku {

    protected String judul;
    protected String penulis;
    protected int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHarga() {
        return harga;
    }

    public int getHargaAkhir() {
        return harga;
    }

    public abstract String getKeterangan();

    protected static String formatRupiah(int jumlah) {
        java.text.DecimalFormatSymbols simbol =
                new java.text.DecimalFormatSymbols(
                        new java.util.Locale("id", "ID"));

        simbol.setGroupingSeparator('.');

        java.text.DecimalFormat format =
                new java.text.DecimalFormat("#,###", simbol);

        return "Rp" + format.format(jumlah);
    }
}
