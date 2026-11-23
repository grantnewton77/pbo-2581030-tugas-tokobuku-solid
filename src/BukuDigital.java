
public class BukuDigital extends Buku implements BisaDiunduh {

    private double ukuranMB;
    private int diskon;

    public BukuDigital(String judul, String penulis,
                       int harga, double ukuranMB, int diskon) {

        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
        this.diskon = diskon;
    }

    @Override
    public int getHargaAkhir() {
        return harga * (100 - diskon) / 100;
    }

    @Override
    public String getKeterangan() {
        return ukuranMB + " MB, diskon " + diskon + "%";
    }

    @Override
    public String getInfoUnduhan() {
        return ukuranMB + " MB";
    }
}

