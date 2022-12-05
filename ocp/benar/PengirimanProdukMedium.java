package ocp.benar;

public class PengirimanProdukMedium extends PengirimanProduk {

    public PengirimanProdukMedium(int biaya) {
        super(biaya);
    }

    @Override
    public int menghitungBiaya() {
        return super.biaya + 4000;
    }

}
