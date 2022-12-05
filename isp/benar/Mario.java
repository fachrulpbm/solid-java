package isp.benar;

public class Mario implements MovingCharacter {

    @Override
    public void maju() {
        System.out.println("Mario maju");
    }

    @Override
    public void melompat() {
        System.out.println("Mario melompat");
    }

    @Override
    public void menembak() {
        System.out.println("Mario menembak");
    }

    @Override
    public void menerimaDamage() {
        System.out.println("Mario menerima damage");
    }

}
