package ocp.salah;

public class PengirimanProduk {
    
    private int biaya;

    public PengirimanProduk(int biaya){
        this.biaya = biaya;
    }

    public int menghitungBiayaSmall(){
        return this.biaya + 3000;
    }

    public int menghitungBiayaMedium(){
        return this.biaya + 4000;
    }

    public int menghitungBiayaLarge(){
        return this.biaya + 5000;
    }

}
