/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MAMAD
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // pemanggilan class Toko
        // inisialisasi objek pada class Toko
        Toko struk = new Toko();
        // memanggil method Display pada class Toko
        struk.Display();
        // memanggil method setAdmin pada class Toko
        struk.setAdmin("Bashar Lentera Jihad Khawariq");
        // memanggil method getAdmin pada class Toko
        System.out.println("Cashier Admin : " + struk.getAdmin() + "      02/11/2020");
        System.out.println("=========================================");

        // pemanggilan class SmartPhone
        // inisialisasi objek pada class SmarPhone
        SmartPhone hp = new SmartPhone();
        // memanggil method Display pada class SmartPhone
        hp.Display();
        // memanggil method setMerk pada class SmartPhone
        hp.setMerk("ROG Phone 3");
        // memanggil method getMerk pada class SmartPhone
        System.out.println("Merk                    : " + hp.getMerk());
        // memanggil method setjumlahKamera pada class SmartPhone
        hp.setjumlahKamera(4);
        // memanggil method getjumlahKamera pada class SmartPhone
        System.out.println("Jumlah Kamera Belakang  : " + hp.getjumlahKamera());
        // memanggil method setTotal pada class SmartPhone
        hp.setTotal(1);
        // memanggil method getTotal pada class SmartPhone
        System.out.println("Total Barang            : " + hp.getTotal());
        // memanggil method setHarga pada class SmartPhone
        hp.setHarga(5999000);
        // memanggil method getHarga pada class SmartPhone
        System.out.println("Harga                   : Rp " + hp.getHarga());

        // pemanggilan class TV
        // inisialisasi objek pada class TV
        TV barang = new TV();
        // memanggil method Display pada class TV
        barang.Display();
        // memanggil method setMerk pada class TV
        barang.setMerk("Philips");
        // memanggil method getMerk pada class TV
        System.out.println("Merk                    : " + barang.getMerk());
        // memanggil method setJenis pada class TV
        barang.setJenis("XY4000A Sky QLED 16K Smart TV (2020)");
        // memanggil method getJenis pada class TV
        System.out.println("Jenis                   : " + barang.getJenis());
        // memanggil method setTotal pada class TV
        barang.setTotal(1);
        // memanggil method getTotal pada class TV
        System.out.println("Total Barang            : " + barang.getTotal());
        // memanggil method setHarga pada class TV
        barang.setHarga(99899000);
        // memanggil method getHarga pada class TV
        System.out.println("Harga                   : Rp " + barang.getHarga());

        // pemanggilan class KipasAngin
        // inisialisasi objek pada class KipasAngin
        KipasAngin produk = new KipasAngin();
        // memanggil method Display pada class KipasAngin
        produk.Display();
        // memanggil method setMerk pada class KipasAngin
        produk.setMerk("Cosmos");
        // memanggil method getMerk pada class KipasAngin
        System.out.println("Merk                    : " + produk.getMerk());
        // memanggil method setUkuran pada class KipasAngin
        produk.setUkuran(55);
        // memanggil method getUkuran pada class KipasAngin
        System.out.println("Ukuran Diameter Kipas   : " + produk.getUkuran() + "cm");
        // memanggil method setTotal pada class KipasAngin
        produk.setTotal(1);
        // memanggil method getTotal pada class KipasAngin
        System.out.println("Total Barang            : " + produk.getTotal());
        // memanggil method setHarga pada class KipasAngin
        produk.setHarga(200999);
        // memanggil method getHarga pada class KipasAngin
        System.out.println("Harga                   : Rp " + produk.getHarga());

        //penutup
        System.out.println("================================================");
        System.out.println("         TERIMAKASIH TELAH BERBELANJA           ");
        System.out.println("   BARANG YANG DIBELI TIDAK DAPAT DIKEMBALIKAN  ");
        System.out.println("            (Kecuali ada Perjanjian)            ");
        System.out.println("================================================");
    }

}
