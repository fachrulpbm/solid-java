package srp.salah;

public class Persegi{

    private int sisi;

    public int getSisi() {
        return this.sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int hitungLuas(){
        return this.sisi * this.sisi;
    }

    public int hitungKeliling(){
        return 4 * this.sisi;
    }

}