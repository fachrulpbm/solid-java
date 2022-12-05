package dip.salah;

public class Transaksi {

    private KartuDebit debit;
    private KartuKredit kredit;

    public Transaksi(KartuDebit debit, KartuKredit kredit){
        this.debit = debit;
        this.kredit = kredit;
    }

    public void menerimaPembayaranDebit(){
        debit.bayar();
    }

    public void menerimaPembayaranKredit(){
        kredit.bayar();
    }
    
}
