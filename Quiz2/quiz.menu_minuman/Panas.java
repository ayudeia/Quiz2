package quiz.menu_minuman;

import quiz.Minuman;

public class Panas extends Minuman {
    public Panas(String nama) {
        super(nama);
    }

    @Override
    public void deskripsi() {
        System.out.println("Minuman: " + nama);
    }
}
