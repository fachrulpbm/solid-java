package ocp.benar;

public abstract class PengirimanProduk {

    protected int biaya;

    public PengirimanProduk(int biaya) {
        this.biaya = biaya;
    }

    public abstract int menghitungBiaya();
    
}
