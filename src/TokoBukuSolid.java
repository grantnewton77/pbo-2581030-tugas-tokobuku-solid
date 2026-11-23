
public class TokoBukuSolid {

    public static void main(String[] args) {

        // Membuat keranjang pertama
        Keranjang keranjangPertama = new Keranjang();

        keranjangPertama.tambah(
                new BukuCetak(
                        "Pemrograman Java",
                        "John Doe",
                        120000,
                        750,
                        10000
                )
        );

        keranjangPertama.tambah(
                new BukuCetak(
                        "Algoritma Dasar",
                        "Jane Smith",
                        95000,
                        400,
                        5000
                )
        );

        keranjangPertama.tambah(
                new BukuDigital(
                        "Belajar OOP",
                        "Ani Wijaya",
                        80000,
                        12.5,
                        20
                )
        );

        keranjangPertama.tambah(
                new BukuAudio(
                        "Kisah Programmer",
                        "Budi Santoso",
                        60000,
                        240,
                        10
                )
        );


        // Membuat keranjang kedua
        Keranjang keranjangKedua = new Keranjang();

        keranjangKedua.tambah(
                new BukuDigital(
                        "Belajar OOP",
                        "Ani Wijaya",
                        80000,
                        12.5,
                        20
                )
        );


        // Membuat empat metode pembayaran
        MetodeBayar[] pilihan = {
                new Tunai(),
                new Transfer(),
                new EWallet(),
                new Voucher(100000)
        };


        // Membuat objek StrukPrinter
        StrukPrinter printer = new StrukPrinter();


        // Mencetak keranjang pertama
        printer.cetakKeranjang(
                "KERANJANG PERTAMA",
                keranjangPertama
        );

        printer.cetakPembayaran(
                keranjangPertama.hitungTotal(),
                pilihan
        );


        // Mencetak keranjang kedua
        printer.cetakKeranjang(
                "KERANJANG KEDUA",
                keranjangKedua
        );

        printer.cetakPembayaran(
                keranjangKedua.hitungTotal(),
                pilihan
        );
    }
}

