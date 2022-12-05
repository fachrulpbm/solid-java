package dip.benar;

public class Transaksi {

    private MetodePembayaran metode;

    public Transaksi(MetodePembayaran metode) {
        this.metode = metode;
    }

    public void menerimaPembayaran(){
        this.metode.bayar();
    }
    
}
