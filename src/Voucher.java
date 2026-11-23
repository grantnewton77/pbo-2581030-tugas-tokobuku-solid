
public class Voucher implements MetodeBayar {

    private int nilaiVoucher;

    public Voucher(int nilaiVoucher) {
        this.nilaiVoucher = nilaiVoucher;
    }

    @Override
    public String nama() {
        return "Voucher " + Buku.formatRupiah(nilaiVoucher);
    }

    @Override
    public int totalBayar(int totalBelanja) {

        // Masalah LSP:
        // return totalBelanja - nilaiVoucher;
        // Jika total belanja Rp64.000 dan voucher Rp100.000,
        // hasilnya menjadi -Rp36.000.
        // Hal ini melanggar kontrak MetodeBayar karena
        // hasil totalBayar tidak boleh negatif.

        // Perbaikan:
        // Math.max() memilih nilai terbesar antara 0
        // dan hasil pengurangan total belanja dengan voucher.
        // Dengan demikian, hasil pembayaran tidak pernah negatif.

        return Math.max(0, totalBelanja - nilaiVoucher);
    }
}
