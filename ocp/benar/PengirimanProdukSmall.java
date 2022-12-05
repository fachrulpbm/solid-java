package ocp.benar;

public class PengirimanProdukSmall extends PengirimanProduk{

    public PengirimanProdukSmall(int biaya) {
        super(biaya);
    }

    @Override
    public int menghitungBiaya() {
        return super.biaya + 3000;
    }
    
}
