package ocp.benar;

public class Main {
    
    public static void main(String[] args) {
        PengirimanProdukSmall small = new PengirimanProdukSmall(1000);
        System.out.println("Biaya pengiriman small product = " + small.menghitungBiaya());

        PengirimanProdukMedium medium = new PengirimanProdukMedium(1000);
        System.out.println("Biaya pengiriman medium product = " + medium.menghitungBiaya());

    }

}
