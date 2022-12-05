package srp.benar;

public class PerhitunganPersegi {

    private Persegi persegi;

    public int hitungLuas(){
        return this.persegi.getSisi() * this.persegi.getSisi();
    }

    public int hitungKeliling(){
        return this.persegi.getSisi() * 4;
    }
    
}
